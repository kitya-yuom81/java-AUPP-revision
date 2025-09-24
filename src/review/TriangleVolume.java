package review;

import java.util.Scanner;

public class TriangleVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base:");
        double base = input.nextDouble();
        System.out.println("Enter height:");
        double height = input.nextDouble();
        System.out.println("Enter length:");
        double length = input.nextDouble();
        double volume = 0.5 * base * height * length ;
        System.out.println("The volume of the triangle is " + volume);


    }
}
