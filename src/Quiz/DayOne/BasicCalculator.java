package Quiz.DayOne;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true; // controls the loop

        System.out.println("🔢 Welcome to the Basic Calculator!");

        while (keepRunning) {
            // Prompt user for input
            System.out.print("Enter an expression (e.g., 10 + 5): ");
            double num1 = scanner.nextDouble();
            String operator = scanner.next();
            double num2 = scanner.nextDouble();

            double result = 0; // variable to store result
            boolean validOperation = true; // flag for valid operator

            // Perform calculation
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("❌ Error: Division by zero is not allowed.");
                        validOperation = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("❌ Invalid operator! Use +, -, *, or /.");
                    validOperation = false;
            }

            // Display result only if operation was valid
            if (validOperation) {
                System.out.println("✅ Result: " + result);
            }

            // Ask if user wants to continue
            System.out.print("Do you want to perform another calculation? (y/n): ");
            String choice = scanner.next();

            // Update loop condition
            if (choice.equalsIgnoreCase("n")) {
                keepRunning = false;
            }
        }

        System.out.println("👋 Thanks for using the calculator!");
        scanner.close();
    }
}
