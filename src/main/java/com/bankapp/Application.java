package com.bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import com.bankapp.application.service.AccountService;
import com.bankapp.application.service.TransactionService;
import com.bankapp.domain.model.Account;
import com.bankapp.infrastructure.dto.AccountDto;
import com.bankapp.infrastructure.dto.TransactionDto;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class Application {

    @Autowired
    private AccountService accountService;

    @Autowired
    private TransactionService transactionService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public CommandLineRunner initDatabase() {
        return args -> {
            // Verificar si ya existen datos iniciales
            if (accountService.getAllAccounts().isEmpty()) {
                // Crear cuentas de ejemplo
                AccountDto account1 = new AccountDto(null, "ACC001", "Juan Pérez", new BigDecimal("1000.00"), "ACTIVE");
                AccountDto account2 = new AccountDto(null, "ACC002", "María López", new BigDecimal("1500.00"), "ACTIVE");
                Account createdAccount1 = accountService.createAccount(account1);
                Account createdAccount2 = accountService.createAccount(account2);

                // Crear transacciones de ejemplo
                TransactionDto transaction1 = new TransactionDto(
                    null,
                    "TRANS001",
                    createdAccount1.getId(),
                    new BigDecimal("100.00"),
                    "DEPOSIT",
                    LocalDateTime.now()
                );
                TransactionDto transaction2 = new TransactionDto(
                    null,
                    "TRANS002",
                    createdAccount2.getId(),
                    new BigDecimal("50.00"),
                    "WITHDRAWAL",
                    LocalDateTime.now()
                );
                transactionService.createTransaction(transaction1);
                transactionService.createTransaction(transaction2);
            }

            // Verificar funcionalidad básica
            List<Account> accounts = accountService.getAllAccounts();
            System.out.println("Cuentas cargadas: " + accounts.size());
            accounts.forEach(account -> System.out.println("ID: " + account.getId() + ", Número: " + account.getAccountNumber()));

            // Validar manejo de errores
            try {
                transactionService.getTransactionByReference("NON_EXISTENT");
            } catch (Exception e) {
                System.out.println("Excepción esperada: " + e.getMessage());
            }
        };
    }
}