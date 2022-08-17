package org.bfi.tech;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ChecksumTest {
    @ParameterizedTest(name = "calculateChecksum({0}) = {1}")
    @CsvSource({
            "11111, 5",
            "22222, 0",
            "111111, 1",
            "12345678, 4",
            "87654321, 0"
    })
    void calculateChecksum(String input, int expected) {
        final int result = MathChallenge.calculateChecksum(input);
        assertEquals(expected, result);
    }
}
