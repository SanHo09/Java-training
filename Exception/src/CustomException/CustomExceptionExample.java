package CustomException;

import java.util.Scanner;

public class CustomExceptionExample {
    private static String[] studentDatabase = {"Alice", "Bob", "Charlie", "David"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Student Name to search: ");
            String searchName = scanner.nextLine();
            findStudent(searchName);

        } catch (StudentNotFoundException e) {
            System.out.println("ALERT: " + e.getMessage());
        } finally {
            System.out.println("Search operation concluded.");
            scanner.close();
        }
    }

    public static void findStudent(String name) throws StudentNotFoundException {
        for (String s : studentDatabase) {
            if (s.equalsIgnoreCase(name)) {
                System.out.println("Student " + name + " found in the system!");
                return;
            }
        }

        // If the loop finishes without finding the name, we throw our custom exception
        throw new StudentNotFoundException("Could not find a student named: " + name);
    }
}
