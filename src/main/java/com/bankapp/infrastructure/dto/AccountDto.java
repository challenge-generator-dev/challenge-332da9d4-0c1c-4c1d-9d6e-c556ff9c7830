package com.bankapp.infrastructure.dto;


import com.bankapp.domain.model.AccountStatus;
import com.bankapp.domain.model.Account;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.UUID;

public record AccountDto(
    @NotNull(message = "El ID no puede ser nulo")
    UUID id,

    @NotBlank(message = "El número de cuenta no puede estar vacío")
    @Size(min = 10, max = 20, message = "El número de cuenta debe tener entre 10 y 20 caracteres")
    String accountNumber,

    @NotBlank(message = "El nombre del cliente no puede estar vacío")
    @Size(min = 2, max = 100, message = "El nombre del cliente debe tener entre 2 y 100 caracteres")
    String customerName,

    @NotNull(message = "El saldo no puede ser nulo")
    @Positive(message = "El saldo debe ser positivo")
    BigDecimal balance,

    @NotBlank(message = "El estado de la cuenta no puede estar vacío")
    String status,

    Integer transactionCount
) {
    public static AccountDto fromDomain(Account account) {
        return new AccountDto(
            account.getId(),
            account.getAccountNumber(),
            account.getCustomerName(),
            account.getBalance(),
            account.getStatus().name(),
            account.getTransactions() != null ? account.getTransactions().size() : 0
        );
    }

    public static AccountDto fromDomainWithCount(Account account, Long transactionCount) {
        return new AccountDto(
            account.getId(),
            account.getAccountNumber(),
            account.getCustomerName(),
            account.getBalance(),
            account.getStatus().name(),
            transactionCount != null ? transactionCount.intValue() : 0
        );
    }

    public Account toDomain() {
        Account account = new Account();
        account.setId(this.id);
        account.setAccountNumber(this.accountNumber);
        account.setCustomerName(this.customerName);
        account.setBalance(this.balance);
        account.setStatus(Account.AccountStatus.valueOf(this.status));
        return account;
    }
}