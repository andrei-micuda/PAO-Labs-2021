package com.company;

public class CounterOutTask implements Task{
    private static int counter = 0;
    @Override
    public void execute() {
        System.out.println(++counter);
    }
}
