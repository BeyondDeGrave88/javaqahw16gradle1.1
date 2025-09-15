package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    public void shouldReturnCorrectRemainderWhenAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 300;

        int actual = service.remain(amount);
        int expected = 700;

        assertEquals(expected, actual);
    }
}