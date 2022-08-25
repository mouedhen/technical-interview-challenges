package org.bfi.problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfitKTransactionTest {

    @ParameterizedTest(name = "maxProfitKTransactions({0}, {1}) = {2}")
    @MethodSource("argumentsProvider")
    void maxProfitUnlimitedTransactions(int[] prices, int k, int expected) {
        int result = StockProfits.maxProfitKTransactions(prices, k);
        assertEquals(expected, result);
    }

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{200, 500, 1000, 700, 30, 400, 900, 400, 550}, 0, 0),
                Arguments.of(new int[]{200, 500, 1000, 700, 30, 400, 900, 400, 550}, 1, 870),
                Arguments.of(new int[]{200, 500, 1000, 700, 30, 400, 900, 400, 550}, 2, 1670),
                Arguments.of(new int[]{200, 500, 1000, 700, 30, 400, 900, 400, 550}, 3, 1820),
                Arguments.of(new int[]{200, 500, 1000, 700, 30, 400, 900, 400, 550}, 4, 1820),
                Arguments.of(new int[]{200, 500, 1000, 700, 30, 400, 900, 400, 550}, 5, 1820),
                Arguments.of(new int[]{200, 500, 1000, 700, 30, 400, 900, 400, 550}, 6, 1820),
                Arguments.of(new int[]{200, 500, 1000, 700, 30, 400, 900, 400, 550}, 7, 1820),
                Arguments.of(new int[]{200, 500, 1000, 700, 30, 400, 900, 400, 550}, 8, 1820),
                Arguments.of(new int[]{200, 500, 1000, 700, 30, 400, 900, 400, 550}, 9, 1820),
                Arguments.of(new int[]{200, 500, 1000, 700, 30, 400, 900, 400, 550}, 100, 1820)
        );
    }

}
