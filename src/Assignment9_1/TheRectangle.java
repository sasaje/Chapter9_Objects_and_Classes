/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 12/10/2020
 *
 */
package Assignment9_1;

public class TheRectangle {
    // The rectangle class
    // Following the example of the Circle class in section 9.2.
    // design a class named Rectangle to represent a rectangle.

    double width; // of the rectangle
    double height; // of the rectangle

    //no-arg constructor, that creates a default rectangle.
    public TheRectangle() {
        this.width = width;
        this.height = height;
    }

    // Constructor which specifies the default values of the width and height
    public TheRectangle(double width, double height) {
        this.width = width = 1;
        this.height = height = 1;
    }


    //method named getArea(), that returns the area of the rectangle.
    public double getArea() {
        return this.width * this.height;
    }

    //method named getArea(), that returns the area of the rectangle - no arguments
    public static double getArea(double width, double height){
        double area = height*width;
        return area;
    }

    //method named getPerimeter() that returns the perimeter - no arguments
    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

    //method named getPerimeter() that returns the perimeter of the width and height
    public static double getPerimeter(double width, double height){
        double perimeter =  width*2+height*2;
        return perimeter;
    }
}