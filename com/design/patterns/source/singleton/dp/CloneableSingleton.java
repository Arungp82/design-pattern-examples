package com.design.patterns.source.singleton.dp;

public class CloneableSingleton implements Cloneable{

    private static CloneableSingleton instance = new CloneableSingleton();

    private CloneableSingleton() {
    }

    public static CloneableSingleton getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Prevent cloning by throwing an exception
        throw new CloneNotSupportedException("Singleton cannot be cloned.");
    }

}
