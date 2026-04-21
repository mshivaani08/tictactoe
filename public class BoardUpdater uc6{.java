public class BoardUpdater {

    // Method to update the board
    public static void updateBoard(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol; // place symbol in given position
    }

    // Method to print the board (for checking)
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Initial empty board
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        int row = 1;
        int col = 1;
        char symbol = 'X';

        // Update board
        updateBoard(board, row, col, symbol);

        // Display updated board
        printBoard(board);
    }
}