package org.bfi.tech;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryConversionTest {
    @ParameterizedTest(name = "toBinary({0}) => {1}")
    @CsvSource({
            "5, 101",
            "7, 111",
            "22, 10110",
            "42, 101010",
            "256, 100000000"
    })
    void toBinary(int value, String expected) {
        String result = RecursionChallenge.toBinary(value);
        assertEquals(expected, result);
    }
}
