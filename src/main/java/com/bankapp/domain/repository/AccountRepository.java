package com.bankapp.domain.repository;

import com.bankapp.domain.model.Account;
import com.bankapp.domain.model.Account.AccountStatus;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AccountRepository {
    
    Optional<Account> findById(UUID id);
    
    Optional<Account> findByAccountNumber(String accountNumber);
    
    List<Account> findAll();
    
    List<Account> findByStatus(AccountStatus status);
    
    List<Account> findByCustomerName(String customerName);
    
    List<Account> findByBalanceGreaterThan(BigDecimal balance);
    
    List<Account> findByBalanceBetween(BigDecimal minBalance, BigDecimal maxBalance);
    
    boolean existsByAccountNumber(String accountNumber);
    
    Account save(Account account);
    
    void deleteById(UUID id);
    
    long count();
    
    long countByStatus(AccountStatus status);
}