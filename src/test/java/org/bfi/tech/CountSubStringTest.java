package org.bfi.tech;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSubStringTest {
    @ParameterizedTest(name = "countSubstring({0}) = {2} | Search for {1}")
    @CsvSource({
            "xhixhix, x, 3",
            "xhixhix, hi, 2",
            "mic, mic, 1",
            "haha, ho, 0",
            "xxxxyz, xx, 2",
            "xxxx, xx, 2",
            "xx-xxx-xxxx-xxxxx-xxxxxx, xx, 9",
            "xx-xxx-xxxx-xxxxx-xxxxxx, xxx, 5"
    })
    void countSubstring(String input, String searchFor, int expected) {
        int result = RecursionChallenge.countSubstring(input, searchFor);
        assertEquals(expected, result);
    }
}
