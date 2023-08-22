package org.launchcode;
import java.util.*;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        if (input.hasNextDouble()){
            Double radius = input.nextDouble();
            while (radius < 0) {
                System.out.println("Radius is negative.");
                System.out.println("Enter a radius: ");
                radius = input.nextDouble();
            }
            System.out.println("The Area of the Circle  is: " + Circle.getArea(radius));
        }
        else {
            System.out.println("Must enter a number.");
        }

        input.close();


    }

}
