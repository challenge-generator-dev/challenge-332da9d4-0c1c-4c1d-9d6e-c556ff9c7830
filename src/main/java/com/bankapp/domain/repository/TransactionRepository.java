package com.bankapp.domain.repository;

import com.bankapp.domain.model.Transaction;
import com.bankapp.domain.model.Transaction.TransactionType;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TransactionRepository {
    
    Optional<Transaction> findById(UUID id);
    
    List<Transaction> findAll();
    
    List<Transaction> findByAccountId(UUID accountId);
    
    List<Transaction> findByType(TransactionType type);
    
    List<Transaction> findByAmountBetween(BigDecimal minAmount, BigDecimal maxAmount);
    
    List<Transaction> findByTimestampBetween(LocalDateTime start, LocalDateTime end);
    
    List<Transaction> findByDescriptionContaining(String descriptionPattern);
    
    boolean existsById(UUID id);
    
    Transaction save(Transaction transaction);
    
    void deleteById(UUID id);
    
    long count();
    
    long countByType(TransactionType type);
    
    BigDecimal sumAmountByAccountId(UUID accountId);
    
    BigDecimal sumAmountByType(TransactionType type);
}