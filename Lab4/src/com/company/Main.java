package com.company;

import java.util.Arrays;

public class Main {

    private static void ex1() {
         var c = new Container(6);
         c.add(
                new RandomTask(),
                new OutTask("Something"),
                new CounterOutTask(),
                new OutTask("Something else"),
                new CounterOutTask(),
                new CounterOutTask(),
                new RandomTask());
         c.runTasks();
    }

    private static void ex2() {
        Album[] lst = {
                new Album("Everyday Is Christmas", "Sia", 9.7f, 2017),
                new Album("Plastic Beach", "Gorillaz", 9.9f, 2010),
                new Album("LSD", "LSD", 9.5f, 2019)
        };

        System.out.println("Unsorted");
        System.out.println(Arrays.toString(lst));

        Arrays.sort(lst);

        System.out.println("Sorted by name");
        System.out.println(Arrays.toString(lst));

        Arrays.sort(lst, new RatingCompare());

        System.out.println("Sorted by rating");
        System.out.println(Arrays.toString(lst));

        Arrays.sort(lst, new YearCompare());

        System.out.println("Sorted by year");
        System.out.println(Arrays.toString(lst));
    }

    private static void ex3() {
        var op = new Operation(0);
        op.plus(20)
          .div(2)
          .mult(3)
          .minus(3);
        System.out.println(op);
    }

    public static void main(String[] args) {
        // ex1();


        // ex2();

        // ex3();
    }
}
