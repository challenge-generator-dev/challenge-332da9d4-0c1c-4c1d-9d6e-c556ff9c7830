package com.bankapp.application.service;


import com.bankapp.domain.model.AccountStatus;
import com.bankapp.domain.model.Account;
import com.bankapp.domain.model.Transaction;
import com.bankapp.domain.model.TransactionType;
import com.bankapp.domain.repository.AccountRepository;
import com.bankapp.domain.repository.TransactionRepository;
import com.bankapp.infrastructure.dto.TransactionDto;
import com.bankapp.infrastructure.exception.TransactionAlreadyExistsException;
import com.bankapp.infrastructure.exception.TransactionNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;
    private final AccountService accountService;

    public TransactionService(TransactionRepository transactionRepository,
                              AccountRepository accountRepository,
                              AccountService accountService) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
        this.accountService = accountService;
    }

    public TransactionDto createTransaction(TransactionDto transactionDto) {
        if (transactionDto.getAmount() == null || transactionDto.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que cero");
        }
        if (transactionDto.getType() == null) {
            throw new IllegalArgumentException("El tipo de transacción es obligatorio");
        }
        if (transactionDto.getAccountId() == null) {
            throw new IllegalArgumentException("El ID de cuenta es obligatorio");
        }

        Account account = accountRepository.findById(transactionDto.getAccountId())
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada"));

        if (account.getStatus() != Account.AccountStatus.ACTIVE) {
            throw new IllegalStateException("La cuenta no está activa para realizar transacciones");
        }

        Transaction transaction = new Transaction();
        transaction.setId(UUID.randomUUID());
        transaction.setType(transactionDto.getType());
        transaction.setAmount(transactionDto.getAmount());
        transaction.setDescription(transactionDto.getDescription());
        transaction.setTimestamp(LocalDateTime.now());
        transaction.setAccount(account);

        if (transactionDto.getType() == TransactionType.DEPOSIT) {
            account.deposit(transactionDto.getAmount());
        } else if (transactionDto.getType() == TransactionType.WITHDRAWAL) {
            if (account.getBalance().compareTo(transactionDto.getAmount()) < 0) {
                throw new IllegalStateException("Saldo insuficiente para realizar el retiro");
            }
            account.withdraw(transactionDto.getAmount());
        }

        accountRepository.save(account);
        Transaction savedTransaction = transactionRepository.save(transaction);
        return mapToDto(savedTransaction);
    }

    public TransactionDto createTransactionWithIdempotency(TransactionDto transactionDto, String idempotencyKey) {
        if (idempotencyKey != null && !idempotencyKey.isBlank()) {
            List<Transaction> existing = transactionRepository.findByDescriptionContaining(idempotencyKey);
            if (!existing.isEmpty()) {
                throw new TransactionAlreadyExistsException("Transacción duplicada detectada: " + idempotencyKey);
            }
        }
        return createTransaction(transactionDto);
    }

    @Transactional(readOnly = true)
    public TransactionDto getTransactionById(UUID id) {
        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Transacción no encontrada con ID: " + id));
        return mapToDto(transaction);
    }

    @Transactional(readOnly = true)
    public List<TransactionDto> getAllTransactions() {
        return transactionRepository.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<TransactionDto> getTransactionsByAccountId(UUID accountId) {
        Account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada"));
        return transactionRepository.findByAccount(account).stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<TransactionDto> getTransactionsByType(TransactionType type) {
        return transactionRepository.findByType(type).stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<TransactionDto> getTransactionsByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Las fechas de inicio y fin son obligatorias");
        }
        if (startDate.isAfter(endDate)) {
            throw new IllegalArgumentException("La fecha de inicio no puede ser posterior a la fecha fin");
        }
        return transactionRepository.findByTimestampBetween(startDate, endDate).stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public TransactionDto updateTransaction(UUID id, TransactionDto transactionDto) {
        Transaction existingTransaction = transactionRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Transacción no encontrada con ID: " + id));

        if (transactionDto.getDescription() != null) {
            existingTransaction.setDescription(transactionDto.getDescription());
        }

        Transaction updatedTransaction = transactionRepository.save(existingTransaction);
        return mapToDto(updatedTransaction);
    }

    public void deleteTransaction(UUID id) {
        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Transacción no encontrada con ID: " + id));
        transactionRepository.delete(transaction);
    }

    @Transactional(readOnly = true)
    public BigDecimal getTotalAmountByType(TransactionType type) {
        List<Transaction> transactions = transactionRepository.findByType(type);
        return transactions.stream()
                .map(Transaction::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Transactional(readOnly = true)
    public List<TransactionDto> getTransactionsGroupedByType() {
        return transactionRepository.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<TransactionDto> getTransactionsOrderedByDate() {
        return transactionRepository.findAllByOrderByTimestampDesc().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    private TransactionDto mapToDto(Transaction transaction) {
        TransactionDto dto = new TransactionDto();
        dto.setId(transaction.getId());
        dto.setType(transaction.getType());
        dto.setAmount(transaction.getAmount());
        dto.setTimestamp(transaction.getTimestamp());
        dto.setDescription(transaction.getDescription());
        if (transaction.getAccount() != null) {
            dto.setAccountId(transaction.getAccount().getId());
        }
        return dto;
    }
}