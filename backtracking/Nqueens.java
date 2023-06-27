public class Nqueens {
    static int count = 0;

    public static void nQueens(char board[][], int row) {
        /// base

        if (row == board.length) {
            print(board);
            count++;

            return;
        }

        ///

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueens(board, row + 1);// function call
                board[row][col] = 'X';// backtracking
            }
        }

    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {

                return false;
            }
        }

        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void print(char board[][]) {

        System.out.println("----------------chess board-----------");
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 8;/// note n is staring from 4
        char board[][] = new char[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                board[row][col] = 'X';
            }
        }

        nQueens(board, 0);/// row staring from 0
        System.out.println("the number of solutions is " + count);

    }
}
