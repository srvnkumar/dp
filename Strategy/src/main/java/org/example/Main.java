package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Paymentcontext context = new Paymentcontext();
        context.setPaymentStrategy(new CreditCardPayment("232323-234324-23423-2343"));
        context.pay(200);
        context.setPaymentStrategy(new UpiPayment("saravana@upi"));
        context.pay(500);
        context.setPaymentStrategy(new NetBankingPayment("HDFC"));
        context.pay(600);

    }
}