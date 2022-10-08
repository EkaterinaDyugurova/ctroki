package ru.netology.stats;


import org.junit.jupiter.api.Test;

import java.security.Provider;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    public void Sum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.salesAmout(sales);
        long expected = 180;

        assertEquals(expected, actual);

    }


    @Test
    public void Mean() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.meanSales(sales);
        long expected = 15;

        assertEquals(expected, actual);


    }


    @Test
    public void MonthMaxSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.maxSales(sales);
        long expected = 8;

        assertEquals(expected, actual);

    }


    @Test
    public void MonthMinSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.minSales(sales);
        long expected = 9;

        assertEquals(expected, actual);

    }


    @Test
    public void SalesBelowTheAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.minMeanSales(sales);
        long expected = 5;

        assertEquals(expected, actual);

    }


    @Test
    public void SalesAboveTheAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.maxMeanSales(sales);
        long expected = 5;

        assertEquals(expected, actual);

    }


}