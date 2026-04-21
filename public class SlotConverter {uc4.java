public class SlotConverter {

    // Utility method to convert slot to row & column
    public static int[] convertSlotToIndex(int slot) {

        // Convert to zero-based index
        int index = slot - 1;

        // Calculate row and column
        int row = index / 3;
        int col = index % 3;

        return new int[]{row, col};
    }

    public static void main(String[] args) {

        int slot = 5; // Example input

        int[] position = convertSlotToIndex(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}