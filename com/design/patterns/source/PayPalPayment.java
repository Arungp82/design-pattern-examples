package com.design.patterns.source;

public class PayPalPayment implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing paypal payments...");
    }
}
