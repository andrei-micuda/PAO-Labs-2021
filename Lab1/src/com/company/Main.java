package com.company;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	    // ex1();

	    // ex2();

        // ex3();

        // ex4();

        // ex5();

        // ex6();

        // ex7();
    }

    static void ex1() {
        int n = input.nextInt();
        for(int i = 0; i <= n; i+=2) {
            System.out.print(i + " ");
        }
    }

    static void ex2() {
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println((a < b) ? b : a);
    }

    static void ex3() {
        int n = input.nextInt();

        System.out.println(factorial(n));
    }

    static void ex4() {
        int n = input.nextInt();
        int res = 0;

        for(int i=0; i<=n; i++) {
            if(i%3==0 || i%5==0) {
                res += i;
            }
        }

        System.out.println(res);
    }

    static int factorial(int n) {
        if(n == 1) return 1;
        return n * factorial(n-1);
    }

    static void ex5() {
        int n = input.nextInt(), i_par = 0, i_impar = 0;
        int[] v_par = new int[n];
        int[] v_impar = new int[n];

        for(int i=0; i<n; i++) {
            int tmp = input.nextInt();
            if(tmp % 2 == 0) {
                v_par[i_par++] = tmp;
            } else {
                v_impar[i_impar++] = tmp;
            }
        }

        System.out.println("Vector elemente pare: ");
        for (int i = 0; i < i_par; i++) {
            System.out.print(v_par[i] + " ");
        }
        System.out.println();

        System.out.println("Vector elemente impare: ");
        for (int i = 0; i < i_impar; i++) {
            System.out.print(v_impar[i] + " ");
        }
    }

    static void ex6() {
        int n = input.nextInt();
        float total = 0.0f;
        int count = 0;
        while(n != -1) {
            total += n;
            count++;
            n = input.nextInt();
        }

        System.out.println(total / count);
    }

    static void ex7() {
        int n = input.nextInt();
        System.out.println(fib(n));
    }

    static int fib(int n) {
        if (n <= 0) return -1;
        if (n <= 2) return 1;
        return fib(n-2) + fib(n-1);
    }
}
