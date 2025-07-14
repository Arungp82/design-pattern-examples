package com.design.patterns.source;

public class DebitCardPayment implements PaymentService{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing debit card payments...");
    }
}
