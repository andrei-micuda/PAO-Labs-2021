package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Main {
    // when checking if a string is a palindrome, we will not consider whitespace or capitalization
    public static boolean testPalindrome(String param) {
        param = param.replaceAll("\\s+", "").toLowerCase();
        StringBuilder str = new StringBuilder(param);
        str.reverse();
        return param.equals(str.toString());
    }

    private static String sortString(String input) {
        char[] tmpChrArr = input.toCharArray();
        Arrays.sort(tmpChrArr);
        return new String(tmpChrArr);
    }

    // when checking if two texts are anagrams, we will not consider whitespace or capitalization
    public static boolean testAnagrams(String text1, String text2) {
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        return sortString(text1).equals(sortString(text2));
    }

    public static void main(String[] args) {
        // ex1
        // var area = new Area();
        // area.printAddress();

        // ex2
        // System.out.println(testPalindrome("Taco Cat"));

        // ex3
        // System.out.println(testAnagrams("The Morse Code", "Here come dots"));

        // ex4
        // PasswordMaker passMkr = PasswordMaker.getInstance("Micu");
        // System.out.println(passMkr.getPassword());
    }
}
