// UC9: Detect if a player has won the game

public static boolean checkWinner(char[][] board, char playerSymbol) {

    // Check Rows
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == playerSymbol &&
            board[i][1] == playerSymbol &&
            board[i][2] == playerSymbol) {
            return true;
        }
    }

    // Check Columns
    for (int j = 0; j < 3; j++) {
        if (board[0][j] == playerSymbol &&
            board[1][j] == playerSymbol &&
            board[2][j] == playerSymbol) {
            return true;
        }
    }

    // Check Main Diagonal
    if (board[0][0] == playerSymbol &&
        board[1][1] == playerSymbol &&
        board[2][2] == playerSymbol) {
        return true;
    }

    // Check Anti-Diagonal
    if (board[0][2] == playerSymbol &&
        board[1][1] == playerSymbol &&
        board[2][0] == playerSymbol) {
        return true;
    }

    return false;
}