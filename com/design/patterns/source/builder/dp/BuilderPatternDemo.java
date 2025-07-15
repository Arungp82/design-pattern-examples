package com.design.patterns.source.builder.dp;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        //Create an immutable order object using the builder pattern
        Order order = new Order.Builder()
                .setOrderId(1234)
                .setOrderEmail("abc@gmail.com")
                .setOrderAmount(10000d)
                .build();

        System.out.println("Order id is "+order.getOrderId());
        System.out.println("Order email is "+order.getOrderEmail());
        System.out.println("Order amount is "+order.getOrderAmount());
    }
}
