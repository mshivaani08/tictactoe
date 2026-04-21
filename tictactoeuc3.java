import java.util.Scanner;

public class UserInput {

    // Method to get slot number from user
    public static int getSlotInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();

        return slot; // return the entered value
    }

    public static void main(String[] args) {

        // Call method
        int selectedSlot = getSlotInput();

        // Display the entered slot
        System.out.println("You selected slot: " + selectedSlot);
    }
}