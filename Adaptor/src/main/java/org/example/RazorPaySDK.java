package org.example;

public class RazorPaySDK {
    public PaymentResult process(double amount, String currency){
        System.out.println("Processing RazorPay:"+amount+" currency:"+ currency);
        return new PaymentResult("12345", true);
    }
}
