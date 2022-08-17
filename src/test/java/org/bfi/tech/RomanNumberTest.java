package org.bfi.tech;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanNumberTest {
    @ParameterizedTest(name = "fromRomanToDecimal(\"{1}\") => {0}")
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "7, VII",
            "9, IX",
            "17, XVII",
            "40, XL",
            "90, XC",
            "400, CD",
            "444, CDXLIV",
            "500, D",
            "900, CM",
            "1000, M",
            "1666, MDCLXVI",
            "1971, MCMLXXI",
            "2018, MMXVIII",
            "2019, MMXIX",
            "2020, MMXX",
            "3000, MMM"
    })
    void fromRomanToDecimal(int arabicNumber, String romanNumber) {
        int result = MathChallenge.fromRomanToDecimal(romanNumber);
        assertEquals(arabicNumber, result);
    }

    @ParameterizedTest(name = "fromDecimalToRoman(\"{1}\") => {0}")
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "7, VII",
            "9, IX",
            "17, XVII",
            "40, XL",
            "90, XC",
            "400, CD",
            "444, CDXLIV",
            "500, D",
            "900, CM",
            "1000, M",
            "1666, MDCLXVI",
            "1971, MCMLXXI",
            "2018, MMXVIII",
            "2019, MMXIX",
            "2020, MMXX",
            "3000, MMM"
    })
    void fromDecimalToRoman(int arabicNumber, String romanNumber) {
        String result = MathChallenge.fromDecimalToRoman(arabicNumber);
        assertEquals(romanNumber, result);
    }
}
