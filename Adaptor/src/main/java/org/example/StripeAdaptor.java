package org.example;

public class StripeAdaptor implements PaymentProcessor{
    private final StripeSDK stripeSDK = new StripeSDK();

    @Override
    public PaymentResponse pay(double amount) {
        String txnId = stripeSDK.makePayment((int) amount * 100);
        return new PaymentResponse(txnId!=null, txnId);
    }
}
