package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentProcessorFactory factory = new PaymentProcessorFactory();
        PaymentProcessor processor = factory.getPaymentProcessor("stripe");
        PaymentResponse pay = processor.pay(20);
        System.out.println(pay.getTransactionId());

        factory = new PaymentProcessorFactory();
         processor = factory.getPaymentProcessor("paypal");
        PaymentResponse pay1 = processor.pay(20);
        System.out.println(pay1.getTransactionId());

        factory = new PaymentProcessorFactory();
         processor = factory.getPaymentProcessor("razor");
        PaymentResponse pay2 = processor.pay(20);
        System.out.println(pay2.getTransactionId());
    }
}