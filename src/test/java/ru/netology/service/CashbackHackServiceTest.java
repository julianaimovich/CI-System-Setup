package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn100IfAmountIs900() {
    CashbackHackService cashbackHackService = new CashbackHackService();
    int expectedResult = 100;
    int actualResult = cashbackHackService.remain(900);
    assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn5IfAmountIs995() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expectedResult = 5;
        int actualResult = cashbackHackService.remain(995);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnZeroIfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expectedResult = 0;
        int actualResult = cashbackHackService.remain(1000);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnExceptionIfAmountIsZeroOrLower() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(0));
    }
}