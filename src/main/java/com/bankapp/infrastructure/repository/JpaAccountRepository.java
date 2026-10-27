package com.bankapp.infrastructure.repository;

import com.bankapp.domain.model.Account;
import com.bankapp.domain.model.Account.AccountStatus;
import com.bankapp.domain.repository.AccountRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class JpaAccountRepository implements AccountRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Account> findById(UUID id) {
        Account account = entityManager.find(Account.class, id);
        return Optional.ofNullable(account);
    }

    @Override
    public Optional<Account> findByAccountNumber(String accountNumber) {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a WHERE a.accountNumber = :accountNumber", Account.class);
        query.setParameter("accountNumber", accountNumber);
        List<Account> results = query.getResultList();
        return results.isEmpty() ? Optional.empty() : Optional.of(results.get(0));
    }

    @Override
    public List<Account> findAll() {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a", Account.class);
        return query.getResultList();
    }

    @Override
    public List<Account> findByStatus(AccountStatus status) {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a WHERE a.status = :status", Account.class);
        query.setParameter("status", status);
        return query.getResultList();
    }

    @Override
    public List<Account> findByCustomerName(String customerName) {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a WHERE a.customerName = :customerName", Account.class);
        query.setParameter("customerName", customerName);
        return query.getResultList();
    }

    @Override
    public List<Account> findByBalanceGreaterThan(BigDecimal balance) {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a WHERE a.balance > :balance", Account.class);
        query.setParameter("balance", balance);
        return query.getResultList();
    }

    @Override
    public List<Account> findByBalanceBetween(BigDecimal minBalance, BigDecimal maxBalance) {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a WHERE a.balance BETWEEN :minBalance AND :maxBalance", Account.class);
        query.setParameter("minBalance", minBalance);
        query.setParameter("maxBalance", maxBalance);
        return query.getResultList();
    }

    @Override
    public boolean existsByAccountNumber(String accountNumber) {
        TypedQuery<Long> query = entityManager.createQuery(
            "SELECT COUNT(a) FROM Account a WHERE a.accountNumber = :accountNumber", Long.class);
        query.setParameter("accountNumber", accountNumber);
        return query.getSingleResult() > 0;
    }

    @Override
    public Account save(Account account) {
        if (account.getId() == null) {
            entityManager.persist(account);
            return account;
        } else {
            return entityManager.merge(account);
        }
    }

    @Override
    public void deleteById(UUID id) {
        Account account = entityManager.find(Account.class, id);
        if (account != null) {
            entityManager.remove(account);
        }
    }

    @Override
    public long count() {
        TypedQuery<Long> query = entityManager.createQuery(
            "SELECT COUNT(a) FROM Account a", Long.class);
        return query.getSingleResult();
    }

    @Override
    public long countByStatus(AccountStatus status) {
        TypedQuery<Long> query = entityManager.createQuery(
            "SELECT COUNT(a) FROM Account a WHERE a.status = :status", Long.class);
        query.setParameter("status", status);
        return query.getSingleResult();
    }

    @Query("SELECT a FROM Account a LEFT JOIN FETCH a.transactions WHERE a.id = :id")
    public Optional<Account> findByIdWithTransactions(@Param("id") UUID id) {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a LEFT JOIN FETCH a.transactions WHERE a.id = :id", Account.class);
        query.setParameter("id", id);
        List<Account> results = query.getResultList();
        return results.isEmpty() ? Optional.empty() : Optional.of(results.get(0));
    }

    @Query("SELECT a FROM Account a WHERE a.balance > :minBalance ORDER BY a.balance DESC")
    public List<Account> findAccountsWithHighBalance(@Param("minBalance") BigDecimal minBalance) {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a WHERE a.balance > :minBalance ORDER BY a.balance DESC", Account.class);
        query.setParameter("minBalance", minBalance);
        return query.getResultList();
    }

    @Query("SELECT DISTINCT a.customerName FROM Account a WHERE a.status = :status")
    public List<String> findDistinctCustomerNamesByStatus(@Param("status") AccountStatus status) {
        TypedQuery<String> query = entityManager.createQuery(
            "SELECT DISTINCT a.customerName FROM Account a WHERE a.status = :status", String.class);
        query.setParameter("status", status);
        return query.getResultList();
    }
}