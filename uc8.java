import java.util.*;

// Program Name: TicTacToeUC8
public class TicTacToeUC8 {

    static char[][] board = new char[3][3];
    static char currentPlayer = 'X';
    static boolean gameRunning = true;

    // Initialize board
    public static void initializeBoard() {
        char value = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = value++;
            }
        }
    }

    // Display board
    public static void displayBoard() {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
    }

    // Player move
    public static void makeMove(Scanner sc) {
        int choice;
        while (true) {
            try {
                System.out.print("Player " + currentPlayer + ", enter position (1-9): ");
                choice = sc.nextInt();

                int row = (choice - 1) / 3;
                int col = (choice - 1) % 3;

                if (choice < 1 || choice > 9) {
                    System.out.println("Invalid input! Choose 1-9.");
                } else if (board[row][col] == 'X' || board[row][col] == 'O') {
                    System.out.println("Position already taken!");
                } else {
                    board[row][col] = currentPlayer;
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Enter a number.");
                sc.next(); // clear invalid input
            }
        }
    }

    // Check win
    public static boolean checkWin() {
        // Rows, Columns, Diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer &&
                board[i][1] == currentPlayer &&
                board[i][2] == currentPlayer) return true;

            if (board[0][i] == currentPlayer &&
                board[1][i] == currentPlayer &&
                board[2][i] == currentPlayer) return true;
        }

        if (board[0][0] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][2] == currentPlayer) return true;

        if (board[0][2] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][0] == currentPlayer) return true;

        return false;
    }

    // Check draw
    public static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 'X' && board[i][j] != 'O') {
                    return false;
                }
            }
        }
        return true;
    }

    // Switch turn
    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // MAIN METHOD (UC8 Flow)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        initializeBoard();

        // While Loop for gameplay
        while (gameRunning) {
            displayBoard();

            // Player Move
            makeMove(sc);

            // Check Win
            if (checkWin()) {
                displayBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameRunning = false;
                break;
            }

            // Check Draw
            if (checkDraw()) {
                displayBoard();
                System.out.println("Game is a draw!");
                gameRunning = false;
                break;
            }

            // Switch Turn
            switchPlayer();
        }

        System.out.println("Game Over.");
        sc.close();
    }
}