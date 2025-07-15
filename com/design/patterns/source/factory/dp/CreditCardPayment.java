package com.design.patterns.source.factory.dp;

import com.design.patterns.source.factory.dp.PaymentService;

public class CreditCardPayment implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payments...");
    }
}
