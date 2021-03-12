package com.company;

import java.util.Random;

public class PasswordMaker {
    private static PasswordMaker instance;

    public static PasswordMaker getInstance(String name) {
        if(instance == null) {
            instance = new PasswordMaker(name);
        }
        return instance;
    }

    private final int MAGIC_NUMBER;
    private final String MAGIC_STRING;
    private final Random RANDOM_GEN;
    private final String data;

    // MAGIC_NUMBER = random number between 10 and 20
    // MAGIC_STRING = 20 random ASCII printable characters
    {
        this.RANDOM_GEN = new Random();
        final int LOWER_BOUND = 10;
        this.MAGIC_NUMBER = generateRandomInt(10, 20);
        this.MAGIC_STRING = generateRandomString(20);
    }

    private int generateRandomInt(int lowerBound, int upperBound) {
        return this.RANDOM_GEN.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    private String generateRandomString(int len) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int asciiCode = generateRandomInt(33, 126);
            str.append((char)asciiCode);
        }
        return str.toString();
    }

    private String extractRandomCharsFromString(String text, int numOfChars) {
        StringBuilder res = new StringBuilder();
        int textLen = text.length();
        for (int i = 0; i < numOfChars; i++) {
            int randomIndex = generateRandomInt(0, textLen-1);
            res.append(text.charAt(randomIndex));
        }
        return res.toString();
    }

    public String getPassword() {
        StringBuilder pass =
                new StringBuilder()
                    .append(generateRandomString(this.MAGIC_NUMBER))
                    .append(extractRandomCharsFromString(this.MAGIC_STRING, 10))
                    .append(this.data.length())
                    .append(generateRandomInt(0, 100));

        return pass.toString();
    }

    private PasswordMaker(String name) {
        this.data = name;
    }
}
