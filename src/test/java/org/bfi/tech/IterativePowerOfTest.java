package org.bfi.tech;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IterativePowerOfTest {
    @ParameterizedTest(name = "powerOfIterative({0}) => {1}")
    @CsvSource({
            "2, 2, 4",
            "4, 2, 16",
            "16, 2, 256",
            "4, 4, 256",
            "2, 8, 256"
    })
    void powerOfIterative(int number, int exponent, long expected) {
        long result = RecursionChallenge.iterativePowerOf(number, exponent);
        assertEquals(expected, result);
    }
}
