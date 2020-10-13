/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 12/10/2020
 *
 */

package Assignment9_1;

public class UserInterface {

    public static void main(String[] args) {

        TheRectangle[] object = new TheRectangle[2];
        object[0] = new TheRectangle(3.5, 35.9);
        object[1] = new TheRectangle(4,40);

        for (int i = 0; i < 2; i++){
            System.out.println("Object " + (i+1) +":");
            System.out.print("Area = " + object[i].getArea());
            System.out.println(" Perimeter = " +  object[i].getPerimeter() +"\n");
        }
    }
}
