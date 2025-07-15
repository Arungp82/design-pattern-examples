package com.design.patterns.source.proxy.dp;

//extends
public class ProxyClass extends RealSubjectClass {
    @Override
    public void method() {
        System.out.println("Hi, I am proxy, i will perform authentication and security checks");
        //Logic to check if user is authentic or not. If yes then call the real object
        //method else don't call the below method
        System.out.println("Calling real method of Real subject implementing class after the call is authenticated");
        super.method();
    }
}
