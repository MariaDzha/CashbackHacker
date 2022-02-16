package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @org.testng.annotations.Test
    public void AmountUnderBoundary (){
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(900);
        assertEquals (actual, expected);

    }

    @org.testng.annotations.Test
    public void AmountOverBoundary (){
        int amount = 1500;
        int expected = 500;
        int actual = cashbackHackService.remain(1500);
        assertEquals (actual, expected);

    }
    @org.testng.annotations.Test
    public void AmountEqualToBoundary (){
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        assertEquals (actual, expected);

    }

    @org.testng.annotations.Test
    public void AmountIsZero (){
        int amount = 0;
        int expected = 1000;
        int actual = cashbackHackService.remain(0);
        assertEquals (actual, expected);

    }

}