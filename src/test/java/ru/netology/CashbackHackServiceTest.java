package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnZeroWhenAmountIsExactlyBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnBoundaryWhenAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCorrectRemainderWhenAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 300;

        int actual = service.remain(amount);
        int expected = 700;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCorrectRemainderWhenAmountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCorrectRemainderWhenAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}