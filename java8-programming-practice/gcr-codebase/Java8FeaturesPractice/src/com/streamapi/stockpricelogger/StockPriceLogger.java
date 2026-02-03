package com.streamapi.stockpricelogger;
import java.util.*;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(
                2450.50,
                2462.75,
                2448.30,
                2475.90,
                2490.10
        );

        System.out.println("Live Stock Price Updates:");

        stockPrices.forEach(price ->
                System.out.println("Stock Price: ₹" + price)
        );
    }
}
