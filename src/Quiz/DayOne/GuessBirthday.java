package Quiz.DayOne;

import java.util.Random;
import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgain = true;

        while (playAgain) {
            // Step 1: Generate a random birthdate
            int year = rand.nextInt(2025 - 1970 + 1) + 1970; // between 1970 and 2025
            int month = rand.nextInt(12) + 1; // 1–12
            int day;

            // Ensure valid days based on month
            if (month == 2) {
                day = rand.nextInt(28) + 1; // Feb: 1–28 (ignoring leap year for simplicity)
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                day = rand.nextInt(30) + 1; // Apr, Jun, Sep, Nov: 1–30
            } else {
                day = rand.nextInt(31) + 1; // Others: 1–31
            }

            int totalGuesses = 0;

            System.out.println("🎉 Welcome to the Birthday Guessing Game!");

            // Step 2: Guess the year
            int guess;
            do {
                System.out.print("Guess the year: ");
                guess = scanner.nextInt();
                totalGuesses++;

                if (guess > year) {
                    System.out.println("Too high!");
                } else if (guess < year) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("✅ Correct! Now guess the month.");
                }
            } while (guess != year);

            // Step 4: Guess the month
            do {
                System.out.print("Guess the month (1-12): ");
                guess = scanner.nextInt();
                totalGuesses++;

                if (guess > month) {
                    System.out.println("Too high!");
                } else if (guess < month) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("✅ Correct! Now guess the day.");
                }
            } while (guess != month);

            // Step 6: Guess the day
            do {
                System.out.print("Guess the day: ");
                guess = scanner.nextInt();
                totalGuesses++;

                if (guess > day) {
                    System.out.println("Too high!");
                } else if (guess < day) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("🎉 Congratulations! You guessed the full birthday!");
                    System.out.println("The birthday was: " + year + "-" + month + "-" + day);
                }
            } while (guess != day);

            // Step 8: Show total guesses
            System.out.println("You made a total of " + totalGuesses + " guesses.");

            // Step 9: Play again option
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Goodbye 👋");
        scanner.close();
    }
}
