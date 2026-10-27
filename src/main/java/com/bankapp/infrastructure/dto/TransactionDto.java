package com.bankapp.infrastructure.dto;

import com.bankapp.domain.model.Transaction;
import com.bankapp.domain.model.TransactionType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record TransactionDto(
    @NotNull(message = "El ID no puede ser nulo")
    UUID id,

    @NotNull(message = "El tipo de transacción no puede ser nulo")
    String type,

    @NotNull(message = "El monto no puede ser nulo")
    @Positive(message = "El monto debe ser positivo")
    BigDecimal amount,

    @NotNull(message = "La fecha y hora no pueden ser nulas")
    LocalDateTime timestamp,

    @NotBlank(message = "La descripción no puede estar vacía")
    @Size(max = 255, message = "La descripción no puede exceder 255 caracteres")
    String description,

    @NotNull(message = "El ID de la cuenta no puede ser nulo")
    UUID accountId,

    String accountNumber,

    String customerName
) {
    public static TransactionDto fromDomain(Transaction transaction) {
        String accountNumber = null;
        String customerName = null;
        if (transaction.getAccount() != null) {
            accountNumber = transaction.getAccount().getAccountNumber();
            customerName = transaction.getAccount().getCustomerName();
        }
        return new TransactionDto(
            transaction.getId(),
            transaction.getType().name(),
            transaction.getAmount(),
            transaction.getTimestamp(),
            transaction.getDescription(),
            transaction.getAccount() != null ? transaction.getAccount().getId() : null,
            accountNumber,
            customerName
        );
    }

    public Transaction toDomain() {
        Transaction transaction = new Transaction();
        transaction.setId(this.id);
        transaction.setType(TransactionType.valueOf(this.type));
        transaction.setAmount(this.amount);
        transaction.setTimestamp(this.timestamp);
        transaction.setDescription(this.description);
        return transaction;
    }

    public static TransactionDto simple(UUID id, String type, BigDecimal amount, LocalDateTime timestamp, String description, UUID accountId) {
        return new TransactionDto(id, type, amount, timestamp, description, accountId, null, null);
    }
}