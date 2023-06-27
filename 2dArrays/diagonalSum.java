import java.util.*;

public class diagonalSum {
    // public static void diagonalsum(int matrix[][], int r, int c) {
    /// time complexity of this code is o(n^2)
    // int sum = 0;
    // for (int i = 0; i < r; i++) {
    // for (int j = 0; j < c; j++) {
    // if (i == j) {
    // sum = sum + matrix[i][j];
    // } else if (i + j == r - 1) {
    // sum = sum + matrix[i][j];
    // }
    // }
    // }
    // System.out.println(sum);

    // }

    public static void diagonalssum(int matrix[][], int r, int c) {
        /// this code timecomplexity is o(n) so we prefer this one
        int sum = 0;
        for (int i = 0; i < r; i++) {
            // pd
            sum = sum + matrix[i][i];

            // sd
            if (i != r - 1 - i)
                sum = sum + matrix[i][r - 1 - i];
        }
        System.out.println("the diagonal sum is " + sum);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        diagonalssum(matrix, r, c);
    }
}
