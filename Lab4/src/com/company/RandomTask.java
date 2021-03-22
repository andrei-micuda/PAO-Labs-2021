package com.company;
import java.util.Random;

public class RandomTask implements Task {

    @Override
    public void execute() {
        var gen = new Random();
        System.out.println("Random number: " + gen.nextInt(100));
    }
}
