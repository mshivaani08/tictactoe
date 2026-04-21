public class TicTacToeBoard {
    public static void main(String[] args) {
        
        // Create a 3x3 board
        char[][] board = new char[3][3];

        // Initialize the board with '-'
        for (int i = 0; i < 3; i++) {          // rows
            for (int j = 0; j < 3; j++) {      // columns
                board[i][j] = '-';
            }
        }

        // Print the board
        for (int i = 0; i < 3; i++) {          // rows
            for (int j = 0; j < 3; j++) {      // columns
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}