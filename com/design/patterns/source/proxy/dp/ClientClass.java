package com.design.patterns.source.proxy.dp;

public class ClientClass {
    public static void main(String[] args) {
        Subject proxy = new ProxyClass();
        proxy.method();
    }
}
