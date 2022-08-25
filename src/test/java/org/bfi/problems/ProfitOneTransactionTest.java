package org.bfi.problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfitOneTransactionTest {

    @ParameterizedTest(name = "maxProfitOneTransaction({0}) = {1}")
    @MethodSource("argumentsProvider")
    void maxProfitOneTransaction(int[] prices, int expected) {
        int result = StockProfits.maxProfitOneTransaction(prices);
        assertEquals(expected, result);
    }

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(Arguments.of(new int[]{200, 500, 1000, 700, 30, 400, 900, 400, 550}, 870));
    }

}
