package org.bfi.tech;

import java.util.HashMap;
import java.util.Map;

public class StringChallenge {
    private StringChallenge() {
        super();
    }

    public static boolean checkBraces(String toCheck) {
        int openingCount = 0;
        for (int i = 0; i < toCheck.length(); i++) {
            final char ch = toCheck.charAt(i);
            if (ch == '(') {
                openingCount++;
            } else if (ch == ')') {
                openingCount--;
                if (openingCount < 0) return false;
            }
        }
        return openingCount == 0;
    }

    static String convertToMorseCode(char currentChar) {
        return switch (currentChar) {
            case 'E' -> ".";
            case 'O' -> "- - -";
            case 'S' -> ". . .";
            case 'T' -> "-";
            case 'W' -> ". - -";
            default -> "?";
        };
    }

    public static String toMorseCode(String toConvert) {
        final StringBuilder convertedMsg = new StringBuilder();
        final String upperCaseInput = toConvert.toUpperCase();
        for (int i = 0; i < upperCaseInput.length(); i++) {
            var currentChar = upperCaseInput.charAt(i);
            var convertedLetter = convertToMorseCode(currentChar);
            convertedMsg.append(convertedLetter);
            convertedMsg.append(" ");
        }
        return convertedMsg.toString().trim();
    }

    public static boolean matchesPattern(String pattern, String text) {
        final int patternLength = pattern.length();
        final String[] values = text.split(" ");
        final int valuesLength = values.length;
        if (valuesLength != patternLength || (values.length == 1 && values[0].isEmpty())) return false;
        final Map<Character, String> placeholderToValueMap = new HashMap<>();


        for (int i = 0; i < pattern.length(); i++) {
            final char patternChar = pattern.charAt(i);
            final String value = values[i];

            placeholderToValueMap.putIfAbsent(patternChar, value);
            if (placeholderToValueMap.values().stream().filter(str -> str.equals(value)).count() > 1) return false;

            final String assignedValue = placeholderToValueMap.get(patternChar);
            if (!assignedValue.equals(value)) return false;
        }
        return true;
    }
}
