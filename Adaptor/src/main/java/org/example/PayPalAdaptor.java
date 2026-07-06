package org.example;

public class PayPalAdaptor implements PaymentProcessor{
    
    private final PayPalSDK payPalSDK = new PayPalSDK();
    @Override
    public PaymentResponse pay(double amount) {
        boolean ok = payPalSDK.send(amount);
        String txnId = ok?"PayPal-"+System.nanoTime():null;
        return new PaymentResponse(ok, txnId);
    }
}
