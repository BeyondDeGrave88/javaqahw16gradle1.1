package ru.netology;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма покупки не может быть отрицательной");
        }
        if (amount == 0) {
            return boundary;
        }
        int remainder = amount % boundary;
        return remainder == 0 ? 0 : boundary - remainder;
    }
}