/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 12/10/2020
 *
 */

package Assignment9_1;

public class Test {
    public static void main(String[] args) {
        // Use case 1     width: 4 and height: 40
        //creates new object of TheRectangle

        TheRectangle object1 = new TheRectangle(4,40);


        //Print the objects area and perimeter
        System.out.println("Object1 height: " + object1.height);
        System.out.println("Object1 width: " + object1.width);
        System.out.println("Object1 area: " + object1.getArea());
        System.out.println("Object1 perimeter: " + object1.getPerimeter());

        System.out.println(" ");

        // Use case 2     width: 3.5 and height: 35.9
        //creates new object of TheRectangle

        TheRectangle object2 = new TheRectangle(3.5,35.9);

        //Print the objects area and perimeter
        System.out.println("Object2 height: " + object2.height);
        System.out.println("Object2 width: " + object2.width);
        System.out.println("Object2 area: " + object2.getArea());
        System.out.println("Object2 perimeter: " + object2.getPerimeter());
    }
}
