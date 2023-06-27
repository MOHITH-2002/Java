class Solution {
    public boolean isValidSudoku(char[][] board) {
        isSudoku(board, 0, 0);
        return true;
    }

    public static boolean isSafe(char board[][], int row, int col, char digit) {
        // row
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) {
                return false;
            }
            // col

            else if (board[row][i] == digit) {
                return false;
            }
        }

        // grid 3x3

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isSudoku(char board[][], int row, int col) {
        // base
        if (row == 9 && col == 0) {
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if (col + 1 == board.length) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = 0;
            ncol = col + 1;
        }
        if (board[row][col] != '.') {

            for (int i = 0; i < board.length; i++) {
                char c = (char) (i + '0');
                if (isSafe(board, nrow, ncol, c)) {
                    board[row][col] = c;
                    if (isSudoku(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '.';

                    }
                }
            }

        }
        return false;
    }
}