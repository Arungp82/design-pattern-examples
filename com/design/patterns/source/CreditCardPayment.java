package com.design.patterns.source;

public class CreditCardPayment implements PaymentService{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payments...");
    }
}
