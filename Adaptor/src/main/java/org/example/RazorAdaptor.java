package org.example;

public class RazorAdaptor implements PaymentProcessor{

    private final RazorPaySDK razorPaySDK = new RazorPaySDK();
    @Override
    public PaymentResponse pay(double amount) {
        PaymentResult usd = razorPaySDK.process(amount, "USD");
        return new PaymentResponse(usd.isSuccess(),usd.getTxnId());
    }
}
