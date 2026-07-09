package org.example;

public class Paymentcontext{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}
