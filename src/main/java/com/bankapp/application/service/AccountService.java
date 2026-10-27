package com.bankapp.application.service;

import com.bankapp.domain.model.Account;
import com.bankapp.domain.model.Account.AccountStatus;
import com.bankapp.domain.repository.AccountRepository;
import com.bankapp.infrastructure.dto.AccountDto;
import com.bankapp.infrastructure.exception.TransactionNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public AccountDto createAccount(AccountDto accountDto) {
        if (accountDto.getAccountNumber() == null || accountDto.getAccountNumber().isBlank()) {
            throw new IllegalArgumentException("El número de cuenta no puede estar vacío");
        }
        if (accountDto.getCustomerName() == null || accountDto.getCustomerName().isBlank()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío");
        }
        if (accountDto.getBalance() == null || accountDto.getBalance().compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }

        Account account = new Account();
        account.setId(UUID.randomUUID());
        account.setAccountNumber(accountDto.getAccountNumber());
        account.setCustomerName(accountDto.getCustomerName());
        account.setBalance(accountDto.getBalance());
        account.setStatus(AccountStatus.ACTIVE);

        Account savedAccount = accountRepository.save(account);
        return mapToDto(savedAccount);
    }

    @Transactional(readOnly = true)
    public AccountDto getAccountById(UUID id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada con ID: " + id));
        return mapToDto(account);
    }

    @Transactional(readOnly = true)
    public AccountDto getAccountByNumber(String accountNumber) {
        Account account = accountRepository.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada: " + accountNumber));
        return mapToDto(account);
    }

    @Transactional(readOnly = true)
    public List<AccountDto> getAllAccounts() {
        return accountRepository.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<AccountDto> getAccountsByStatus(AccountStatus status) {
        return accountRepository.findByStatus(status).stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public AccountDto updateAccount(UUID id, AccountDto accountDto) {
        Account existingAccount = accountRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada con ID: " + id));

        if (accountDto.getCustomerName() != null && !accountDto.getCustomerName().isBlank()) {
            existingAccount.setCustomerName(accountDto.getCustomerName());
        }
        if (accountDto.getStatus() != null) {
            existingAccount.setStatus(accountDto.getStatus());
        }

        Account updatedAccount = accountRepository.save(existingAccount);
        return mapToDto(updatedAccount);
    }

    public AccountDto updateBalance(UUID id, BigDecimal newBalance) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada con ID: " + id));

        if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }

        account.setBalance(newBalance);
        Account updatedAccount = accountRepository.save(account);
        return mapToDto(updatedAccount);
    }

    public void deleteAccount(UUID id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada con ID: " + id));

        if (account.getBalance().compareTo(BigDecimal.ZERO) > 0) {
            throw new IllegalStateException("No se puede eliminar una cuenta con saldo positivo");
        }

        accountRepository.delete(account);
    }

    public AccountDto deactivateAccount(UUID id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada con ID: " + id));

        account.setStatus(AccountStatus.INACTIVE);
        Account updatedAccount = accountRepository.save(account);
        return mapToDto(updatedAccount);
    }

    public AccountDto activateAccount(UUID id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada con ID: " + id));

        account.setStatus(AccountStatus.ACTIVE);
        Account updatedAccount = accountRepository.save(account);
        return mapToDto(updatedAccount);
    }

    private AccountDto mapToDto(Account account) {
        AccountDto dto = new AccountDto();
        dto.setId(account.getId());
        dto.setAccountNumber(account.getAccountNumber());
        dto.setCustomerName(account.getCustomerName());
        dto.setBalance(account.getBalance());
        dto.setStatus(account.getStatus());
        return dto;
    }
}