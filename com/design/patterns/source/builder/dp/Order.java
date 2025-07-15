package com.design.patterns.source.builder.dp;

public class Order {
    private final Integer orderId;
    private final String orderName;
    private final String shippingAddress;
    private final String orderEmail;
    private final Double orderAmount;

    private Order(Builder builder) {
this.orderId=builder.orderId;
this.orderName=builder.orderName;
this.shippingAddress=builder.shippingAddress;
this.orderEmail=builder.orderEmail;
this.orderAmount=builder.orderAmount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getOrderEmail() {
        return orderEmail;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    /*
     * This is the core of the builder pattern
     * It mirrors the fields in the main class but with non-final mutable fields*/
    public static class Builder {
        private Integer orderId;
        private String orderName;
        private String shippingAddress;
        private String orderEmail;
        private Double orderAmount;

        /*
         * Setters for the builder (can be chained)
         * These methods set the individual fields in the builder*/
        public Builder setOrderId(Integer orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setOrderName(String orderName) {
            this.orderName = orderName;
            return this;
        }

        public Builder setShippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder setOrderEmail(String orderEmail) {
            this.orderEmail = orderEmail;
            return this;
        }

        public Builder setOrderAmount(Double orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
