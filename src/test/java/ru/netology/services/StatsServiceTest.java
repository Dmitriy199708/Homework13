package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {


    @Test
    public void testSumm() {  //сумму всех продаж
        StatsService service = new StatsService();

        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.summSales(sales);

        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void avgSummMonth() { //  среднюю сумму продаж в месяц
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 17, 75};

        int expected = 19;
        int actual = service.avgSummMonth(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testMin() {  //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 2, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void testMax() {
        StatsService service = new StatsService(); //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму

        long[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 2, 14, 14, 18};

        int expected = 6;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void quantityMonthMinAvgSales() { //количество месяцев, в которых продажи были ниже среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 2, 14, 14, 18};


        int expected = 3;
        int actual = service.quantityMonthMinAvgSales(sales);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void quantityMonthMaxAvgSales() { //количество месяцев, в которых продажи были ниже среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 2, 14, 14, 18};


        int expected = 7;
        int actual = service.quantityMonthMaxAvgSales(sales);

        Assertions.assertEquals(expected, actual);

    }
}
