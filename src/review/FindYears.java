package review;

import java.util.Scanner;

public class FindYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers of minutes");
        Long minutes = input.nextLong();
        Long years= minutes/525600;
        Long Remaining = minutes%525600;
        Long Days = Remaining/1440;
        System.out.println(minutes + " minutes is approximately "
                + years + " years and " + Days + " days.");

    }
}
