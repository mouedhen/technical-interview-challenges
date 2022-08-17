package org.bfi.tech;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOfTwoTest {
    @ParameterizedTest(name = "isPowerOf2({0}) => {1}")
    @CsvSource({
            "2, true",
            "3, false",
            "4, true",
            "10, false",
            "16, true"
    })
    void isPowerOf2(int number, boolean expected) {
        boolean result = RecursionChallenge.isPowerOfTwo(number);
        assertEquals(expected, result);
    }
}
