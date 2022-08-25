package org.bfi.tech;

import java.util.HashSet;
import java.util.Set;

public class RecursionChallenge {
    private RecursionChallenge() {
        super();
    }

    public static String toBinary(final int input) {
        if (input < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }

        if (input <= 1) {
            return String.valueOf(input);
        }

        final int lastDigit = input % 2;
        final int remainder = input / 2;
        return toBinary(remainder) + lastDigit;
    }

    public static String toOctal(int input) {
        return null;
    }

    public static String toHex(int input) {
        return null;
    }

    public static boolean isPowerOfTwo(int toCheck) {
        return false;
    }

    public static long powerOf(int number, int power) {
        return 0L;
    }

    public static long iterativePowerOf(int number, int power) {
        return 0L;
    }

    public static boolean isNumberPalindrome(int toCheck) {
        return false;
    }

    public static Set<String> retrievePermutations(String input) {
        return new HashSet<>();
    }

    public static int countSubstring(String input, String term) {
        return 0;
    }
}
