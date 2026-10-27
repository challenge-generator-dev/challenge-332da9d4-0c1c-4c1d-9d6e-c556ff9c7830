package com.bankapp.infrastructure.repository;

import com.bankapp.domain.model.Transaction;
import com.bankapp.domain.model.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface JpaTransactionRepository extends JpaRepository<Transaction, UUID> {

    List<Transaction> findByAccountId(UUID accountId);

    Optional<Transaction> findByIdAndAccountId(UUID id, UUID accountId);

    List<Transaction> findByType(TransactionType type);

    @Query("SELECT t FROM Transaction t WHERE t.account.id = :accountId ORDER BY t.timestamp DESC")
    List<Transaction> findRecentTransactionsByAccountId(@Param("accountId") UUID accountId);

    @Query("SELECT t FROM Transaction t JOIN t.account a WHERE a.accountNumber = :accountNumber ORDER BY t.timestamp DESC")
    List<Transaction> findByAccountNumber(@Param("accountNumber") String accountNumber);

    @Query("SELECT t FROM Transaction t WHERE t.timestamp BETWEEN :startDate AND :endDate ORDER BY t.timestamp ASC")
    List<Transaction> findByDateRange(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);

    @Query("SELECT t.type, COUNT(t) FROM Transaction t WHERE t.account.id = :accountId GROUP BY t.type")
    List<Object[]> countTransactionsByTypeForAccount(@Param("accountId") UUID accountId);

    @Query("SELECT t.type, SUM(t.amount) FROM Transaction t WHERE t.account.id = :accountId GROUP BY t.type")
    List<Object[]> sumAmountsByTypeForAccount(@Param("accountId") UUID accountId);

    @Query("SELECT a.accountNumber, SUM(t.amount) FROM Transaction t JOIN t.account a GROUP BY a.accountNumber ORDER BY SUM(t.amount) DESC")
    List<Object[]> findTotalAmountByAccount();

    @Query("SELECT t.type, AVG(t.amount) FROM Transaction t WHERE t.account.id = :accountId GROUP BY t.type")
    List<Object[]> findAverageAmountByTypeForAccount(@Param("accountId") UUID accountId);

    @Query("SELECT t FROM Transaction t WHERE t.account.id = :accountId AND t.amount > :amount ORDER BY t.amount DESC")
    List<Transaction> findTransactionsAboveAmount(@Param("accountId") UUID accountId, @Param("amount") BigDecimal amount);

    @Query("SELECT t FROM Transaction t WHERE t.description LIKE %:keyword% ORDER BY t.timestamp DESC")
    List<Transaction> findByDescriptionContaining(@Param("keyword") String keyword);

    @Query("SELECT t FROM Transaction t JOIN t.account a WHERE a.customerName = :customerName ORDER BY t.timestamp DESC")
    List<Transaction> findByCustomerName(@Param("customerName") String customerName);

    @Query(value = "SELECT t.id, t.amount, t.type, t.description, t.timestamp, t.account_id FROM transactions t INNER JOIN accounts a ON t.account_id = a.id WHERE a.status = 'ACTIVE' ORDER BY t.timestamp DESC", nativeQuery = true)
    List<Object[]> findActiveAccountTransactions();

    @Query("SELECT t FROM Transaction t WHERE t.account.id = :accountId ORDER BY t.amount DESC")
    List<Transaction> findLargestTransactionsByAccount(@Param("accountId") UUID accountId);

    @Query("SELECT COUNT(t) FROM Transaction t WHERE t.account.id = :accountId")
    Long countByAccountId(@Param("accountId") UUID accountId);

    @Query("SELECT MAX(t.amount) FROM Transaction t WHERE t.account.id = :accountId AND t.type = :type")
    BigDecimal findMaxAmountByAccountAndType(@Param("accountId") UUID accountId, @Param("type") TransactionType type);

    @Query("SELECT MIN(t.amount) FROM Transaction t WHERE t.account.id = :accountId AND t.type = :type")
    BigDecimal findMinAmountByAccountAndType(@Param("accountId") UUID accountId, @Param("type") TransactionType type);
}