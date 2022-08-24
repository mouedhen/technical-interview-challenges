package org.bfi.tech;

import java.util.ArrayList;
import java.util.List;

public class MathChallenge {
    private MathChallenge() {
        super();
    }

    static boolean isPerfectNumber(final int number) {
        int multipliersSum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                multipliersSum += i;
            }
        }
        return number == multipliersSum;
    }

    public static List<Integer> retrievePerfectNumbers(final int maxExclusive) {
        final List<Integer> results = new ArrayList<>();
        for (int i = 2; i < maxExclusive; i++) {
            if (isPerfectNumber(i)) {
                results.add(i);
            }
        }
        return results;
    }

    static boolean isPrimeNumber(final int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> retrievePrimeNumbers(int maxValue) {
        final List<Integer> results = new ArrayList<>();
        for (int i = 2; i <= maxValue; i++) {
            if (isPrimeNumber(i)) {
                results.add(i);
            }
        }
        return results;
    }

    public static int calculateChecksum(String input) {
        int crc = 0;
        for (int i = 0; i < input.length(); i++) {
            final char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                final int position = i + 1;
                final int value = (currentChar - '0') * position;
                crc += value;
            } else {
                throw new IllegalArgumentException("illegal char " + currentChar);
            }
        }
        return crc % 10;
    }

    public static int fromRomanToDecimal(String romanNumber) {
        return 0;
    }

    public static String fromDecimalToRoman(int decimalNumber) {
        return null;
    }
}
