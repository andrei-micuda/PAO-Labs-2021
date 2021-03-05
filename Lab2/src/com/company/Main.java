package com.company;

public class Main {
    public static void ex1() {
        Person p1 = new Person("Popescu", "Ion", 36, 123456789, "test");
        Person p2 = new Person("Ionescu", "Andrei", 21, 987654321, "alttest");
        System.out.println(p1);
        System.out.println(p2);
    }

    public static void ex2() {
        Room r1 = new Room(123, "apartment", 5);
        Room r2 = new Room(200, "penthouse", 25);
        System.out.println(r1);
        System.out.println(r2);
    }

    public static void ex3() {
        Subject s1 = new Subject(
            new Room(123, "apartment", 5),
            25,
            new Person("Popescu", "Ion", 36, 123456789, "test")
        );
        Subject s2 = new Subject(
                new Room(200, "penthouse", 25),
                34,
                new Person("Ionescu", "Andrei", 21, 987654321, "alttest")
        );

        System.out.println(s1);
        System.out.println(s2);
    }

    public static void ex4() {
        Singleton s1 = Singleton.getInstance(10);
        Singleton s2 = Singleton.getInstance(20);

        System.out.println(s1.getData());
        System.out.println(s2.getData());
    }

    public static void main(String[] args) {
        // ex1();

        // ex2();

        // ex3();

        // ex4();
    }
}
