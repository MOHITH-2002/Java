public class Suduko {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // row
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // col
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // grid 3x3

        int sr = (row / 3) * 3; // sr starting from (0,1,2/3)*3 = 0;(3,4,5/3)*3 = 1;(6,7,8/3)*3=2; so the values
                                // are 0,1,2
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }

            }
        }

        return true;
    }

    public static boolean isSudoku(int sudoku[][], int row, int col) {
        // base
        if (row == 9 && col == 0) {
            return true;
        }

        // recursion
        int nextRow = row;
        int nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        // else
        if (sudoku[row][col] != 0) {

            return isSudoku(sudoku, nextRow, nextCol);
        }
        // else
        for (int digit = 1; digit <= 9; digit++) {// digits start from 1 to 9
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (isSudoku(sudoku, nextRow, nextCol)) { /// solution exists
                    return true;
                }
                // else
                sudoku[row][col] = 0;

            }

        }
        return false;
    }

    public static void print(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int sudoku[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 2, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        if (isSudoku(sudoku, 0, 0)) {
            System.out.println("solution exits");
            print(sudoku);

        } else {
            System.out.println("solution does not exists");
        }
    }
}
