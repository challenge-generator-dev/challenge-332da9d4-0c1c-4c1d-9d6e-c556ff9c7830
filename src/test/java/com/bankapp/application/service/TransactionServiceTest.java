package com.bankapp.application.service;

import com.bankapp.domain.model.Account;
import com.bankapp.domain.model.Account.AccountStatus;
import com.bankapp.domain.model.Transaction;
import com.bankapp.domain.model.Transaction.TransactionType;
import com.bankapp.domain.repository.AccountRepository;
import com.bankapp.domain.repository.TransactionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TransactionServiceTest {

    @Mock
    private TransactionRepository transactionRepository;

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private TransactionService transactionService;

    private Account testAccount;
    private Transaction testTransaction;

    @BeforeEach
    void setUp() {
        testAccount = new Account();
        testAccount.setId(UUID.randomUUID());
        testAccount.setAccountNumber("ACC-12345");
        testAccount.setCustomerName("María García");
        testAccount.setBalance(new BigDecimal("5000.00"));
        testAccount.setStatus(AccountStatus.ACTIVE);

        testTransaction = new Transaction();
        testTransaction.setId(UUID.randomUUID());
        testTransaction.setType(TransactionType.DEPOSIT);
        testTransaction.setAmount(new BigDecimal("1000.00"));
        testTransaction.setTimestamp(LocalDateTime.now());
        testTransaction.setDescription("Depósito inicial");
        testTransaction.setAccount(testAccount);
    }

    @Test
    @Disabled("Completar los assertions para verificar creación de transacción")
    void testCreateTransaction_shouldCreateSuccessfully() {
        when(accountRepository.findById(any(UUID.class))).thenReturn(Optional.of(testAccount));
        when(transactionRepository.existsById(any(UUID.class))).thenReturn(false);
        when(transactionRepository.save(any(Transaction.class))).thenAnswer(inv -> inv.getArgument(0));

        // Given: una cuenta válida y datos de transacción
        TransactionType type = TransactionType.DEPOSIT;
        BigDecimal amount = new BigDecimal("1500.00");
        String description = "Depósito de prueba";

        // When: se crea la transacción
        Transaction result = transactionService.createTransaction(
            testAccount.getId(), type, amount, description);

        // Then: verificar que se creó correctamente
        // FALTA: assertNotNull(result) y assertEquals(type, result.getType())
    }

    @Test
    @Disabled("Completar el manejo de cuenta no encontrada")
    void testCreateTransaction_shouldThrowWhenAccountNotFound() {
        UUID nonExistentAccountId = UUID.randomUUID();
        when(accountRepository.findById(nonExistentAccountId)).thenReturn(Optional.empty());

        // Given: ID de cuenta que no existe
        // When/Then: debe lanzar excepción
        // FALTA: assertThrows con AccountNotFoundException o similar
    }

    @Test
    @Disabled("Completar el manejo de transacción duplicada")
    void testCreateTransaction_shouldThrowWhenTransactionAlreadyExists() {
        when(accountRepository.findById(any(UUID.class))).thenReturn(Optional.of(testAccount));
        when(transactionRepository.existsById(testTransaction.getId())).thenReturn(true);

        // Given: una transacción que ya existe
        // When/Then: debe lanzar TransactionAlreadyExistsException
        // FALTA: assertThrows(TransactionAlreadyExistsException.class, ...)
    }

    @Test
    @Disabled("Completar los assertions para verificar transacción encontrada")
    void testFindById_shouldReturnTransaction() {
        when(transactionRepository.findById(any(UUID.class)))
            .thenReturn(Optional.of(testTransaction));

        // When
        Optional<Transaction> result = transactionService.findById(testTransaction.getId());

        // Then
        // FALTA: assertTrue(result.isPresent())
        // FALTA: assertEquals(testTransaction.getId(), result.get().getId())
    }

    @Test
    @Disabled("Completar el caso de transacción no encontrada")
    void testFindById_shouldThrowWhenNotFound() {
        UUID nonExistentId = UUID.randomUUID();
        when(transactionRepository.findById(nonExistentId)).thenReturn(Optional.empty());

        // When/Then
        // FALTA: assertThrows(TransactionNotFoundException.class, ...)
    }

    @Test
    @Disabled("Completar los assertions para verificar validación")
    void testValidateTransaction_shouldReturnTrueForValidTransaction() {
        // Given: una transacción válida
        testTransaction.setAmount(new BigDecimal("100.00"));
        testTransaction.setType(TransactionType.WITHDRAWAL);

        // When
        boolean isValid = testTransaction.isValid();

        // Then
        // FALTA: assertTrue(isValid)
    }

    @Test
    @Disabled("Completar el caso de transacción inválida")
    void testValidateTransaction_shouldReturnFalseForInvalidAmount() {
        // Given: transacción con monto negativo
        testTransaction.setAmount(new BigDecimal("-50.00"));

        // When
        boolean isValid = testTransaction.isValid();

        // Then
        // FALTA: assertFalse(isValid)
    }
}