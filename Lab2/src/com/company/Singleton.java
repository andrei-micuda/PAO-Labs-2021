package com.company;

public class Singleton {
    private static Singleton instance = null;

    private int data;

    public int getData() {
        return data;
    }

    private Singleton(int data) {
        this.data = data;
    }

    public static Singleton getInstance(int x) {
        if(instance == null) {
            instance = new Singleton(x);
        }
        return instance;
    }
}
