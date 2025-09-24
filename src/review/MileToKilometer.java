package review;

import java.util.Scanner;

public class MileToKilometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Miles:");
        double miles = sc.nextDouble();
        double Kilometer = miles * 1.60934;
        System.out.println("The Kilometer is: " + Kilometer);

    }
}
