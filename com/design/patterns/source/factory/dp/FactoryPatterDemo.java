package com.design.patterns.source.factory.dp;

import com.design.patterns.source.factory.dp.PaymentFactory;
import com.design.patterns.source.factory.dp.PaymentService;

public class FactoryPatterDemo {
    public static void main(String[] args) {
        String userPaymentChoice = "CREDITCARD";
        PaymentService paymentService= PaymentFactory.getPaymentService(userPaymentChoice);
        if(paymentService!=null){
            paymentService.processPayment(100.0);
        }else {
            System.out.println("Invalid payment method selected");
        }
    }
}
