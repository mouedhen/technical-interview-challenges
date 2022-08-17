package org.bfi.tech;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class PerfectNumbersTest {
    public static Stream<Arguments> maxAndPerfectNumbers() {
        return Stream.of(
                Arguments.of(1_000, List.of(6, 28, 496)),
                Arguments.of(10_000, List.of(6, 28, 496, 8_128))
        );
    }

    @ParameterizedTest(name = "retrievePerfectNumbers({0}) = {1}")
    @MethodSource("maxAndPerfectNumbers")
    void retrievePerfectNumbers(final int maxExclusive, List<Integer> expected) {
        final List<Integer> result = MathChallenge.retrievePerfectNumbers(maxExclusive);
        assertEquals(expected, result);
    }
}
