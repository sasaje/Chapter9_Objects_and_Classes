/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 13/10/2020
 *
 */

package Assignment9_2;
// Write a test program that creates a Stock object with the stock symbol ORCL, the name Oracle Corporation,
// and the previous closing price of 34.5.
// Set a new current price to 34.35 and display the price-change percentage.

public class Test {

    static TheStockClass stock1 = new TheStockClass("ORCL","Oracle Corporation", 34.5, 34.35);

    public static void main(String[] args) {
        System.out.println("Name of the stock: " + stock1.name);
        System.out.println("Symbol of the stock: " + stock1.symbol);
        System.out.println("Previous Closing Price: " + stock1.previousClosingPrice);
        System.out.println("Current Price: " + stock1.currentPrice);
        System.out.println("The percentage change: " + TheStockClass.getChangePercent(stock1.previousClosingPrice,stock1.currentPrice) + "%");
    }
}
