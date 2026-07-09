package org.example;

public class NetBankingPayment implements PaymentStrategy {
    private final String bank;

    public NetBankingPayment(String bank) {
        this.bank = bank;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+ amount+ " using NetBanking:"+ bank);
    }
}
