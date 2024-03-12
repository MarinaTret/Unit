package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void amountMore0() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2400);
        int expected = 600;
        assertEquals(expected, actual);
    }

    @Test
    public void amount0() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void amount1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }
}