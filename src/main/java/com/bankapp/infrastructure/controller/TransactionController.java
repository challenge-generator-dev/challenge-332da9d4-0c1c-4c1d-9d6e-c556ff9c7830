package com.bankapp.infrastructure.controller;


import com.bankapp.domain.model.TransactionType;
import com.bankapp.application.service.TransactionService;
import com.bankapp.domain.model.Transaction;
import com.bankapp.infrastructure.dto.TransactionDto;
import com.bankapp.infrastructure.exception.TransactionAlreadyExistsException;
import com.bankapp.infrastructure.exception.TransactionNotFoundException;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public ResponseEntity<List<TransactionDto>> getAllTransactions() {
        List<Transaction> transactions = transactionService.findAll();
        List<TransactionDto> transactionDtos = transactions.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(transactionDtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransactionDto> getTransactionById(@PathVariable UUID id) {
        Transaction transaction = transactionService.findById(id);
        return ResponseEntity.ok(toDto(transaction));
    }

    @GetMapping("/account/{accountId}")
    public ResponseEntity<List<TransactionDto>> getTransactionsByAccountId(@PathVariable UUID accountId) {
        List<Transaction> transactions = transactionService.findByAccountId(accountId);
        List<TransactionDto> transactionDtos = transactions.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(transactionDtos);
    }

    @PostMapping
    public ResponseEntity<TransactionDto> createTransaction(@Valid @RequestBody TransactionDto transactionDto) {
        Transaction transaction = toEntity(transactionDto);
        Transaction createdTransaction = transactionService.create(transaction);
        return ResponseEntity.status(HttpStatus.CREATED).body(toDto(createdTransaction));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TransactionDto> updateTransaction(
            @PathVariable UUID id,
            @Valid @RequestBody TransactionDto transactionDto) {
        Transaction transaction = toEntity(transactionDto);
        Transaction updatedTransaction = transactionService.update(id, transaction);
        return ResponseEntity.ok(toDto(updatedTransaction));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable UUID id) {
        transactionService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/duplicate-check")
    public ResponseEntity<TransactionDto> checkAndCreateTransaction(
            @PathVariable UUID id,
            @Valid @RequestBody TransactionDto transactionDto) {
        try {
            Transaction existingTransaction = transactionService.findById(id);
            throw new TransactionAlreadyExistsException(
                    "Transaction already exists with ID: " + id,
                    id,
                    existingTransaction.getDescription()
            );
        } catch (TransactionNotFoundException e) {
            Transaction transaction = toEntity(transactionDto);
            Transaction createdTransaction = transactionService.create(transaction);
            return ResponseEntity.status(HttpStatus.CREATED).body(toDto(createdTransaction));
        }
    }

    private TransactionDto toDto(Transaction transaction) {
        TransactionDto dto = new TransactionDto();
        dto.setId(transaction.getId());
        dto.setType(transaction.getType().name());
        dto.setAmount(transaction.getAmount());
        dto.setTimestamp(transaction.getTimestamp());
        dto.setDescription(transaction.getDescription());
        if (transaction.getAccount() != null) {
            dto.setAccountId(transaction.getAccount().getId());
        }
        return dto;
    }

    private Transaction toEntity(TransactionDto dto) {
        Transaction transaction = new Transaction();
        transaction.setType(com.bankapp.domain.model.TransactionType.valueOf(dto.getType()));
        transaction.setAmount(dto.getAmount());
        transaction.setDescription(dto.getDescription());
        return transaction;
    }
}