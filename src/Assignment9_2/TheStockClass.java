/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 13/10/2020
 *
 */

package Assignment9_2;

// Follow the example of the Circle class in Section 9.2, design a class named stock that contains:
    // A string data field named symbol for the stock's symbol.
    // A string data field named name for the stock's name.
    // A double data field named previousClosingPrice that stores the stock price for the previous day.
    // A double data field named currentPrice that stores the stock price for the current time.
    // A constructor that creates a stock with the specified symbol and name.
    // A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.
// Write a test program that creates a Stock object with the stock symbol ORCL, the name Oracle Corporation,
// and the previous closing price of 34.5.
// Set a new current price to 34.35 and display the price-change percentage.

public class TheStockClass {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    // all argument constructor + percentage change
    public TheStockClass(String symbol, String name, double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;

        getChangePercent(previousClosingPrice,currentPrice);
    }
    public TheStockClass(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    // Method that returns the percentage changed from previousClosingPrice to currentPrice
    public static double getChangePercent(double previousClosingPrice, double currentPrice){
        // % increase = Increase ÷ Original Number × 100.
        double changePercent = ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
        return changePercent;
    }
}

