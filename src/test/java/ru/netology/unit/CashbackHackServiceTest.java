package ru.netology.unit;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @org.junit.Test
    public void AmountUnderBoundary (){
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(900);
        assertEquals (expected, actual);

    }

    @org.junit.Test
    public void AmountOverBoundary (){
        int amount = 1500;
        int expected = 500;
        int actual = cashbackHackService.remain(1500);
        assertEquals (expected, actual);

    }
    @org.junit.Test
    public void AmountEqualToBoundary (){
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        assertEquals (expected, actual);

    }

    @org.junit.Test
    public void AmountIsZero (){
        int amount = 0;
        int expected = 1000;
        int actual = cashbackHackService.remain(0);
        assertEquals (expected, actual);

    }

}