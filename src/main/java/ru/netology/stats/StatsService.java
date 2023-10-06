package ru.netology.stats;


public class StatsService {

    public int summSales(long[] sales) { //Сумма всех продаж
        int summMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            summMonth += sales[i];
        }

        return summMonth;
    }


    public int avgSummMonth(long[] sales) { //Cредняя  сумма продаж в месяц
        long avgSumm;
        long summArr = 0;
        for (int i = 0; i < sales.length; i++) {
            summArr += sales[i];
        }
        avgSumm = summArr / sales.length;
        return (int) avgSumm;
    }


    public int minSales(long[] sales) {  // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1; //minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) { // номер месяца с максимальными продажами среди просмотренных ранее
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; //minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int quantityMonthMinAvgSales(long[] sales) { //количество месяцев, в которых продажи были ниже среднего

        int quantityMonthMin = 0;
        int avgSumm = 0;
        int summArr = 0;
        for (int i = 0; i < sales.length; i++) {
            summArr += sales[i];
        }
        avgSumm = summArr / sales.length;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avgSumm) {
                quantityMonthMin += 1; // добавляет 0 +1
            }
        }
        return quantityMonthMin;

    }


    public int quantityMonthMaxAvgSales(long[] sales) { //Количество месяцев, в которых продажи были выше среднего

        int quantityMonthMax = 0;
        int avgSumm = 0;
        int summArr = 0;
        for (int i = 0; i < sales.length; i++) {
            summArr += sales[i];
        }
        avgSumm = summArr / sales.length;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avgSumm) {
                quantityMonthMax += 1; // добавляет 0 +1
            }
        }
        return quantityMonthMax;

    }
}
