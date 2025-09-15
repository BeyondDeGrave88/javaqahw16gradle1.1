package ru.netology;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {
    //  Старые
    @Test
    public void shouldReturnZeroWhenAmountIsExactlyBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBoundaryWhenAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectRemainderWhenAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 300;

        int actual = service.remain(amount);
        int expected = 700;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectRemainderWhenAmountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectRemainderWhenAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenAmountIsNegative() {
        CashbackHackService service = new CashbackHackService();
        int amount = -100;

        service.remain(amount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenAmountIsVeryNegative() {
        CashbackHackService service = new CashbackHackService();
        int amount = -1000;

        service.remain(amount);
    }

    // Новые
    @Test
    public void shouldReturnZeroWhenAmountIsExactlyBoundaryJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBoundaryWhenAmountIsZeroJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectRemainderWhenAmountLessThanBoundaryJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 300;

        int actual = service.remain(amount);
        int expected = 700;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectRemainderWhenAmountMoreThanBoundaryJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectRemainderWhenAmountIsMultipleOfBoundaryJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionWhenAmountIsNegativeJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = -100;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.remain(amount);
        });
    }

    @Test
    public void shouldThrowExceptionWhenAmountIsVeryNegativeJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = -1000;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.remain(amount);
        });
    }
}