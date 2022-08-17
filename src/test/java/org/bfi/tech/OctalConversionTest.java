package org.bfi.tech;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OctalConversionTest {
    @ParameterizedTest(name = "toOctal({0}) => {1}")
    @CsvSource({
            "42, 52",
            "7, 7",
            "8, 10"
    })
    void toOctal(int value, String expected) {
        String result = RecursionChallenge.toOctal(value);
        assertEquals(expected, result);
    }
}
