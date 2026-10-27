package com.bankapp.application.service;

import com.bankapp.domain.model.Account;
import com.bankapp.domain.model.Account.AccountStatus;
import com.bankapp.domain.repository.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountService accountService;

    private Account testAccount;

    @BeforeEach
    void setUp() {
        testAccount = new Account();
        testAccount.setId(UUID.randomUUID());
        testAccount.setAccountNumber("ACC-12345");
        testAccount.setCustomerName("Juan Pérez");
        testAccount.setBalance(new BigDecimal("1000.00"));
        testAccount.setStatus(AccountStatus.ACTIVE);
    }

    @Test
    @Disabled("Completar los assertions para verificar el depósito")
    void testDeposit_shouldIncreaseBalance() {
        when(accountRepository.findById(any(UUID.class))).thenReturn(Optional.of(testAccount));
        when(accountRepository.save(any(Account.class))).thenAnswer(inv -> inv.getArgument(0));

        // Given: una cuenta con saldo inicial
        BigDecimal initialBalance = testAccount.getBalance();
        BigDecimal depositAmount = new BigDecimal("500.00");

        // When: se ejecuta el depósito
        Account result = accountService.deposit(testAccount.getId(), depositAmount);

        // Then: el saldo debe incrementarse
        // FALTA: assert que verifique el nuevo saldo
    }

    @Test
    @Disabled("Completar los assertions para verificar el retiro")
    void testWithdraw_shouldDecreaseBalance() {
        when(accountRepository.findById(any(UUID.class))).thenReturn(Optional.of(testAccount));
        when(accountRepository.save(any(Account.class))).thenAnswer(inv -> inv.getArgument(0));

        // Given: una cuenta con saldo inicial
        BigDecimal initialBalance = testAccount.getBalance();
        BigDecimal withdrawAmount = new BigDecimal("300.00");

        // When: se ejecuta el retiro
        Account result = accountService.withdraw(testAccount.getId(), withdrawAmount);

        // Then: el saldo debe decrementarse
        // FALTA: assert que verifique el nuevo saldo
    }

    @Test
    @Disabled("Completar el caso de prueba para cuenta no encontrada")
    void testWithdraw_shouldThrowExceptionWhenInsufficientFunds() {
        // Given: una cuenta con saldo insuficiente
        testAccount.setBalance(new BigDecimal("100.00"));
        when(accountRepository.findById(any(UUID.class))).thenReturn(Optional.of(testAccount));

        BigDecimal withdrawAmount = new BigDecimal("500.00");

        // When/Then: debe lanzar excepción
        // FALTA: assertThrows con la excepción apropiada
    }

    @Test
    @Disabled("Completar los assertions para verificar cuenta encontrada")
    void testFindById_shouldReturnAccount() {
        when(accountRepository.findById(any(UUID.class))).thenReturn(Optional.of(testAccount));

        // When
        Optional<Account> result = accountService.findById(testAccount.getId());

        // Then
        // FALTA: assertTrue y assertEquals para verificar
    }

    @Test
    @Disabled("Completar los assertions para cuenta inexistente")
    void testFindById_shouldReturnEmptyWhenNotFound() {
        UUID nonExistentId = UUID.randomUUID();
        when(accountRepository.findById(nonExistentId)).thenReturn(Optional.empty());

        // When
        Optional<Account> result = accountService.findById(nonExistentId);

        // Then
        // FALTA: assertTrue(result.isEmpty())
    }
}