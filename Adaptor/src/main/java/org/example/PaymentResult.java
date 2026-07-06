package org.example;

public class PaymentResult {

    private final String txnId;

    private final boolean success;

    public PaymentResult(String txnId, boolean success) {
        this.txnId = txnId;
        this.success = success;
    }

    public String getTxnId() {
        return txnId;
    }

    public boolean isSuccess() {
        return success;
    }
}
