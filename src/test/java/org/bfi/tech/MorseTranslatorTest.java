package org.bfi.tech;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseTranslatorTest {
    @ParameterizedTest(name = "toMorseCode({0}) => ''{1}''")
    @CsvSource({
            "SOS, . . . - - - . . .",
            "TWEET, - . - - . . -",
            "OST, - - - . . . -",
            "WEST, . - - . . . . -"
    })
    void testToMorseCode(String input, String expected) {
        var result = StringChallenge.toMorseCode(input);
        assertEquals(expected, result);
    }
}
