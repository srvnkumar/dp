package org.example;

public class PaymentProcessorFactory {

    PaymentProcessor getPaymentProcessor(String processor){
        return switch(processor.toLowerCase()){
            case "stripe"->new StripeAdaptor();
            case "paypal"->new PayPalAdaptor();
            case "razor"->new RazorAdaptor();
            default -> throw new IllegalArgumentException("Uknown parameter:"+ processor);
        };
    }
}
