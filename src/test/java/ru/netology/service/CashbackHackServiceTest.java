package ru.netology.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackHackData.csv", numLinesToSkip = 1)
    @DisplayName("Should calculate missing amount")
    void shouldCalculateMissingAmount(int amount, int expectedResult) {
    CashbackHackService cashbackHackService = new CashbackHackService();
    int actualResult = cashbackHackService.remain(amount);
    assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should throw exception if amount is 0 or lower")
    void shouldThrowExceptionIfAmountIsZeroOrLower() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(0));
    }
}