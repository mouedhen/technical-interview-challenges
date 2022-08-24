package org.bfi.tech;

import java.util.*;

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

    static Map<Character, Integer> romanNumberMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1_000
    );

    public static int fromRomanToDecimal(String romanNumber) {
        int value = 0;
        int lastDigitValue = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            final char romanDigit = romanNumber.charAt(i);
            final int digitValue = romanNumberMap.getOrDefault(romanDigit, 0);

            final boolean addMode = digitValue >= lastDigitValue;
            if (addMode) {
                value += digitValue;
                lastDigitValue = digitValue;
            } else {
                value -= digitValue;
            }
        }
        return value;
    }

    static Map<Integer, String> intToRomanMap = new TreeMap<>() {{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1_000, "M");
    }};

    static String repeatCharSequence(final String value, final int repetitionTimes) {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < repetitionTimes; i++) {
            builder.append(value);
        }
        return builder.toString();
    }

    public static String fromDecimalToRoman(int decimalNumber) {
        final StringBuilder result = new StringBuilder();
        int remainder = decimalNumber;

        final Comparator<Integer> reversed = Comparator.reverseOrder();
        final Map<Integer, String> sortedIntToRomanDigit = new TreeMap<>(reversed);
        sortedIntToRomanDigit.putAll(intToRomanMap);

        var iterator = sortedIntToRomanDigit.entrySet().iterator();
        while (iterator.hasNext() && remainder > 0) {
            final Map.Entry<Integer, String> entry = iterator.next();

            final int multiplier = entry.getKey();
            final String romanDigit = entry.getValue();

            if (remainder >= 900 && romanDigit.equals("D")) {
                result.append("CM");
                remainder -= 900;
            } else if (remainder >= 4 && romanDigit.equals("I")) {
                result.append("IV");
                remainder -= 4;
            } else {
                result.append(repeatCharSequence(romanDigit, remainder / multiplier));
                remainder = remainder % multiplier;
            }
        }

        return result.toString();
    }
}
