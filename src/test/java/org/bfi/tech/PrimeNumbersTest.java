package org.bfi.tech;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class PrimeNumbersTest {
    @ParameterizedTest(name = "retrievePerfectNumbers({0}) = {1}")
    @MethodSource("argumentsProvider")
    void retrievePerfectNumbers(int n, List<Integer> expected) {
        List<Integer> result = MathChallenge.retrievePrimeNumbers(n);
        assertEquals(expected, result);
    }

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(2, List.of(2)),
                Arguments.of(3, List.of(2, 3)),
                Arguments.of(10, List.of(2, 3, 5, 7)),
                Arguments.of(15, List.of(2, 3, 5, 7, 11, 13)),
                Arguments.of(25, List.of(2, 3, 5, 7, 11, 13, 17, 19, 23)),
                Arguments.of(50, List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47))
        );
    }
}
