package TryCatchFinally;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        DivisionWithTryCatch();
    }
    public static void DivisionWithoutTryCatch() {
        Scanner scanner = new Scanner(System.in);
        int input1, input2, result;

        while(true) {
            System.out.print("Enter Input 1: ");
            input1 = scanner.nextInt();

            System.out.print("Enter Input 2: ");
            input2 = scanner.nextInt();

            result = input1 / input2;
            System.out.println("Result: " + result);
        }
    }

    public static void DivisionWithTryCatch() {
        Scanner scanner = new Scanner(System.in);
        boolean success = false;

        while (!success) {
            try {
                System.out.print("Enter Input 1: ");
                int input1 = scanner.nextInt();

                System.out.print("Enter Input 2: ");
                int input2 = scanner.nextInt();

                int result = input1 / input2;
                System.out.println("Result: " + result);
                success = true;

            } catch (ArithmeticException e) {
                System.out.println("Catch: Cannot divide by zero.");
            } catch (InputMismatchException e) {
                System.out.println("Catch: Please enter valid integers.");
                scanner.nextLine(); // Clear the buffer
            } finally {
                // This runs every single time the loop iterates
                System.out.println("Finally: End of attempt iteration.");
                System.out.println("---");
            }
        }

        System.out.println("Program successfully completed.");
        scanner.close();
    }
}