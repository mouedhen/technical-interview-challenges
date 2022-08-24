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

    public static List<Integer> retrievePrimeNumbers(int maxValue) {
        return new ArrayList<>();
    }

    public static int calculateChecksum(String input) {
        return 0;
    }

    public static int fromRomanToDecimal(String romanNumber) {
        return 0;
    }

    public static String fromDecimalToRoman(int decimalNumber) {
        return null;
    }
}
