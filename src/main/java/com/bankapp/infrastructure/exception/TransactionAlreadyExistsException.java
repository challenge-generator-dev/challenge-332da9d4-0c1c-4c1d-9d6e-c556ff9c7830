package com.bankapp.infrastructure.exception;


import com.bankapp.domain.model.Transaction;
import java.util.UUID;

public class TransactionAlreadyExistsException extends RuntimeException {
    private final UUID transactionId;
    private final String transactionReference;
    private final int errorCode;

    public TransactionAlreadyExistsException(String message) {
        super(message);
        this.transactionId = null;
        this.transactionReference = null;
        this.errorCode = 409;
    }

    public TransactionAlreadyExistsException(String message, UUID transactionId) {
        super(message);
        this.transactionId = transactionId;
        this.transactionReference = null;
        this.errorCode = 409;
    }

    public TransactionAlreadyExistsException(String message, UUID transactionId, String transactionReference) {
        super(message);
        this.transactionId = transactionId;
        this.transactionReference = transactionReference;
        this.errorCode = 409;
    }

    public TransactionAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
        this.transactionId = null;
        this.transactionReference = null;
        this.errorCode = 409;
    }

    public TransactionAlreadyExistsException(String message, UUID transactionId, Throwable cause) {
        super(message, cause);
        this.transactionId = transactionId;
        this.transactionReference = null;
        this.errorCode = 409;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getDetailedMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransactionAlreadyExistsException: ").append(getMessage());
        if (transactionId != null) {
            sb.append(" | Transaction ID: ").append(transactionId);
        }
        if (transactionReference != null) {
            sb.append(" | Reference: ").append(transactionReference);
        }
        sb.append(" | Error Code: ").append(errorCode);
        return sb.toString();
    }

    @Override
    public String toString() {
        return getDetailedMessage();
    }
}