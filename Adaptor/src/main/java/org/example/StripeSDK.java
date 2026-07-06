package org.example;

public class StripeSDK {
   public String makePayment(int amountInCents){
       System.out.println("Stripe SDK payment:"+ amountInCents);
       return "StripeSDK";
    }
}
