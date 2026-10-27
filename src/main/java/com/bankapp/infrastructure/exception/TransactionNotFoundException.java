package com.bankapp.infrastructure.exception;

public class TransactionNotFoundException extends RuntimeException {

    private final String transactionId;

    public TransactionNotFoundException(String message) {
        super(message);
        this.transactionId = null;
    }

    public TransactionNotFoundException(String message, Throwable cause) {
        super(message, cause);
        this.transactionId = null;
    }

    public TransactionNotFoundException(String message, String transactionId) {
        super(message);
        this.transactionId = transactionId;
    }

    public TransactionNotFoundException(String message, String transactionId, Throwable cause) {
        super(message, cause);
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public String toString() {
        if (transactionId != null) {
            return "TransactionNotFoundException: " + getMessage() + " [ID: " + transactionId + "]";
        }
        return "TransactionNotFoundException: " + getMessage();
    }
}