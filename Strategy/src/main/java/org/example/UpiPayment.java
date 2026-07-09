package org.example;

public class UpiPayment implements PaymentStrategy{
   private final String upId;

    public UpiPayment(String upId) {
        this.upId = upId;
    }


    @Override
    public void pay(int amount) {
        System.out.printf("Paid %d using upid:%s%n", amount, upId);
    }
}
