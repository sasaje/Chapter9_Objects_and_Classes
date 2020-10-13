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
//      TheRectangle object1 = new TheRectangle(4,40);
        double object1Area  = TheRectangle.getArea(4,40);
        double object1Perimeter = TheRectangle.getPerimeter(4,40);

        //Print the objects area and perimeter
        System.out.println("Object1 height: " + TheRectangle.getWidth(4));
        System.out.println("Object1 width: " + TheRectangle.getHeight(40));
        System.out.println("Object1 area: " + object1Area);
        System.out.println("Object1 perimeter: " + object1Perimeter);

        System.out.println(" ");

        // Use case 2     width: 3.5 and height: 35.9
        //creates new object of TheRectangle
//      TheRectangle object2 = new TheRectangle(3.5,35.9);
        double object2Area  = TheRectangle.getArea(3.5,35.9);
        double object2Perimeter = TheRectangle.getPerimeter(3.5,35.9);

        //Print the objects area and perimeter
        System.out.println("Object2 height: " + TheRectangle.getWidth(3.5));
        System.out.println("Object2 width: " + TheRectangle.getHeight(35.9));
        System.out.println("Object2 area: " + object2Area);
        System.out.println("Object2 perimeter: " + object2Perimeter);
    }
}
