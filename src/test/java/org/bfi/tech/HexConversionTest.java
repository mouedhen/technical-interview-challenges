package org.bfi.tech;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HexConversionTest {
    @ParameterizedTest(name = "toHex({0}) => {1}")
    @CsvSource({
            "77, 4D",
            "15, F",
            "16, 10"
    })
    void toHex(int value, String expected) {
        String result = RecursionChallenge.toHex(value);
        assertEquals(expected, result);
    }
}
