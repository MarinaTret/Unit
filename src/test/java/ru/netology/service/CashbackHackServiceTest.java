package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void amountMore0() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2400);
        int expected = 600;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void amount0() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void amount1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}