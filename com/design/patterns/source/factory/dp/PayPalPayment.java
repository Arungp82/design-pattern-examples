package com.design.patterns.source.factory.dp;

import com.design.patterns.source.factory.dp.PaymentService;

public class PayPalPayment implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing paypal payments...");
    }
}
