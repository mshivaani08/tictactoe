import java.util.*;

// Program Name: StringAndExceptionPractice
public class StringAndExceptionPractice {

    // Method 1: Create and display strings (Escape sequence included)
    public static void displayStrings() {
        String name = "Shivaani";
        String message = "Hello,\nWelcome to Java Practice!\n\"Keep Learning\"";
        
        System.out.println("Name: " + name);
        System.out.println("Message with Escape Sequence:\n" + message);
    }

    // Method 2: Take string input
    public static String takeInput(Scanner sc) {
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        return input;
    }

    // Method 3: String as method parameter + built-in methods
    public static void stringOperations(String input) {
        System.out.println("\n--- String Operations ---");
        System.out.println("Length: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("First word: " + input.split(" ")[0]);
    }

    // Method 4: String Array
    public static void stringArrayExample() {
        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("\n--- String Array ---");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    // Method 5: ASCII Character Codes
    public static void displayASCII(String input) {
        System.out.println("\n--- ASCII Values ---");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.println(ch + " -> " + (int) ch);
        }
    }

    // Method 6: Checked Exception Example
    public static void checkedExceptionExample() {
        System.out.println("\n--- Checked Exception Example ---");
        try {
            Thread.sleep(1000); // may throw InterruptedException
            System.out.println("Waited for 1 second");
        } catch (InterruptedException e) {
            System.out.println("Checked Exception handled: " + e);
        }
    }

    // Method 7: Unchecked Exception Example
    public static void uncheckedExceptionExample() {
        System.out.println("\n--- Unchecked Exception Example ---");
        try {
            int result = 10 / 0; // ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception handled: " + e);
        }
    }

    // Method 8: Custom Exception Handling
    public static void validateAge(int age) {
        if (age < 18) {
            throw new RuntimeException("Age must be 18 or above");
        } else {
            System.out.println("Valid age");
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Level 1
            displayStrings();
            String userInput = takeInput(sc);
            stringOperations(userInput);
            stringArrayExample();

            // Level 2
            displayASCII(userInput);

            System.out.print("\nEnter your age: ");
            int age = sc.nextInt();

            // Level 3
            validateAge(age);

        } catch (RuntimeException e) {
            System.out.println("Runtime Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e);
        } finally {
            System.out.println("\nProgram executed successfully.");
        }

        // Exception Examples
        checkedExceptionExample();
        uncheckedExceptionExample();

        sc.close();
    }
}