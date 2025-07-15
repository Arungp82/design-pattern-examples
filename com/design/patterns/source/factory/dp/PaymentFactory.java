package com.design.patterns.source.factory.dp;

public class PaymentFactory {
    public static PaymentService getPaymentService(String paymentType){
        if(paymentType==null){
            return null;
        }
        if(paymentType == "CREDITCARD"){
            return new CreditCardPayment();
        }
        if(paymentType == "DEBITCARD"){
            return new DebitCardPayment();
        }
        if(paymentType == "PAYPAL"){
            return new PayPalPayment();
        }
        return null;
    }
}
