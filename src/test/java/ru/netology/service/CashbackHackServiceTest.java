package ru.netology.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    @DisplayName("Should return 100 if amount is 900")
    void shouldReturn100IfAmountIs900() {
    CashbackHackService cashbackHackService = new CashbackHackService();
    int expectedResult = 100;
    int actualResult = cashbackHackService.remain(900);
    assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should return 5 if amount is 995")
    void shouldReturn5IfAmountIs995() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expectedResult = 5;
        int actualResult = cashbackHackService.remain(995);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should return 0 if amount is 1000")
    void shouldReturnZeroIfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expectedResult = 0;
        int actualResult = cashbackHackService.remain(1000);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should throw exception if amount is 0 or lower")
    void shouldThrowExceptionIfAmountIsZeroOrLower() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(0));
    }
}