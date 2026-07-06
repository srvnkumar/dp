package org.example;

public class PaymentResponse {
    private final boolean success;
    private final String transactionId;

    public PaymentResponse(boolean success, String transactionId) {
        this.success = success;
        this.transactionId = transactionId;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getTransactionId() {
        return transactionId;
    }
}
