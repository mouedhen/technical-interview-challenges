package org.bfi.tech;

import java.util.HashSet;
import java.util.Set;

public class RecursionChallenge {
    private RecursionChallenge() {
        super();
    }

    public static String toBinary(final int input) {
        if (input < 0) {
            throw new IllegalArgumentException("input must be >= 0");
        }

        if (input <= 1) {
            return String.valueOf(input);
        }

        final int lastDigit = input % 2;
        final int remainder = input / 2;
        return toBinary(remainder) + lastDigit;
    }

    public static String toOctal(final int input) {
        if (input < 0) {
            throw new IllegalArgumentException("input must be >= 0");
        }

        if (input < 8) {
            return String.valueOf(input);
        }

        final int lastDigit = input % 8;
        final int remainder = input / 8;
        return toOctal(remainder) + lastDigit;
    }

    static String asHexDigit(final int input) {
        if (input < 0) {
            throw new IllegalArgumentException("input must be >= 0");
        }

        if (input <= 15) {
            final char hexDigit = "0123456789ABCDEF".charAt(input);
            return String.valueOf(hexDigit);
        }

        throw new IllegalArgumentException("value not in range 0 - 15, but is: " + input);
    }

    public static String toHex(int input) {
        if (input < 0) {
            throw new IllegalArgumentException("input must be >= 0");
        }

        if (input <= 15) {
            return asHexDigit(input);
        }

        final int lastDigit = input % 16;
        final int remainder = input / 16;

        return toHex(remainder) + asHexDigit(lastDigit);
    }

    public static boolean isPowerOfTwo(final int toCheck) {
        return toCheck == 1 || toCheck > 0 && toCheck % 2 == 0 && isPowerOfTwo(toCheck / 2);
    }

    public static long powerOf(final int number, final int power) {
        if (power < 0) {
            throw new IllegalArgumentException("Exponent must be >= 0");
        }

        if (power == 0) {
            return 1;
        }

        if (power == 1) {
            return number;
        }

        final long result = powerOf(number * number, power / 2);
        if (power % 2 == 1) {
            return number * result;
        }

        return result;
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
