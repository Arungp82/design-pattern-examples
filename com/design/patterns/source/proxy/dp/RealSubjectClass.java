package com.design.patterns.source.proxy.dp;

//implementation of the subject
public class RealSubjectClass implements Subject {
    @Override
    public void method() {
        System.out.println("Actual implementation of the subject, rest all are proxies : D ");
    }
}
