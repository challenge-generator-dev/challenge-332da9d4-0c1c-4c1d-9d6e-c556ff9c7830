package com.bankapp.infrastructure.controller;

import com.bankapp.application.service.AccountService;
import com.bankapp.domain.model.Account.AccountStatus;
import com.bankapp.infrastructure.dto.AccountDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@Valid @RequestBody AccountDto accountDto) {
        AccountDto created = accountService.createAccount(accountDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable UUID id) {
        AccountDto account = accountService.getAccountById(id);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/number/{accountNumber}")
    public ResponseEntity<AccountDto> getAccountByNumber(@PathVariable String accountNumber) {
        AccountDto account = accountService.getAccountByNumber(accountNumber);
        return ResponseEntity.ok(account);
    }

    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        List<AccountDto> accounts = accountService.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<AccountDto>> getAccountsByStatus(@PathVariable AccountStatus status) {
        List<AccountDto> accounts = accountService.getAccountsByStatus(status);
        return ResponseEntity.ok(accounts);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AccountDto> updateAccount(@PathVariable UUID id,
                                                     @Valid @RequestBody AccountDto accountDto) {
        AccountDto updated = accountService.updateAccount(id, accountDto);
        return ResponseEntity.ok(updated);
    }

    @PatchMapping("/{id}/balance")
    public ResponseEntity<AccountDto> updateBalance(@PathVariable UUID id,
                                                     @RequestParam BigDecimal balance) {
        AccountDto updated = accountService.updateBalance(id, balance);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable UUID id) {
        accountService.deleteAccount(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/deactivate")
    public ResponseEntity<AccountDto> deactivateAccount(@PathVariable UUID id) {
        AccountDto deactivated = accountService.deactivateAccount(id);
        return ResponseEntity.ok(deactivated);
    }

    @PatchMapping("/{id}/activate")
    public ResponseEntity<AccountDto> activateAccount(@PathVariable UUID id) {
        AccountDto activated = accountService.activateAccount(id);
        return ResponseEntity.ok(activated);
    }
}