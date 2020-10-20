package Assignment9_5;
/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 19/10/2020
 *
 */

/*
*
* Assignment 9,5 - Use the GregorianCalendar class
* Java API has the GregorianCalendar class in the java.util package, which you can use to obtain the year, month, day at
* a date. The no-arg constructor constructs an instance for the current date, and the methods get(GregorianCalendar.YEAR),
* get(GregorianCalendar, MONTH), and get(GregorianCalendar,DAY_OF_MONTH) return the year, month, and day.
*
* Write a program to perform two tasks:
* 1. Display the current year, month and day.
* 2. The GregorianCalendar class has setTimeInMilis(long), which can be used to set a specified elapsed time since
* January 1., 1970. Set the value to 1234567898765L and display the year, month and day.
*
* */

import java.util.GregorianCalendar;

public class UseTheGregorianCalendar {
    public static void main(String[] args) {

    // GregorianCalendar calendar created
    GregorianCalendar gregorianCalendar = new GregorianCalendar();

    int month = gregorianCalendar.getInstance().get(gregorianCalendar.MONTH)+1;
    int year = gregorianCalendar.get(gregorianCalendar.YEAR);
    int dayOfMonth = gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH);

        // 1. Display the current year, month and day.
        System.out.println("The current (dd/mm/yyyy) is: " + dayOfMonth + "/" + month + "/" + year + ".");

        // 2. Set the value to 1234567898765L and display the year, month and day
        gregorianCalendar.setTimeInMillis(1234567898765L);
        int elapsedDayOfTheMonth = gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH);
        int elapsedMonth = gregorianCalendar.get(gregorianCalendar.MONTH)+1;
        int elapsedYear = gregorianCalendar.get(gregorianCalendar.YEAR);

        System.out.println("After setting time to setTimeInMillis(1234567898765L) displayed as the day, month, year: " + elapsedDayOfTheMonth + "/" +
                elapsedMonth + "/" + elapsedYear + ".");

    }
}
