import java.util.*;
/// vvvvip code must learn 

public class spiralMaatrix {

    public static void spiralMatrix(int matrix[][], int r, int c) {

        int startRow = 0;
        int startCol = 0;
        int endrow = r - 1;
        int endcol = c - 1;
        while (startRow <= endrow && startCol <= endcol) {
            // top row
            for (int j = startCol; j <= endcol; j++) {
                System.out.print(matrix[startRow][j] + " ");

            }
            // right
            for (int i = startRow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            // bottom
            for (int j = endcol - 1; j >= startCol; j--) {
                if (startRow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            // left
            for (int i = endrow - 1; i >= startRow + 1; i--) {
                if (startCol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            endrow--;
            startCol++;
            endcol--;

        }
        System.out.println();
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
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        spiralMatrix(matrix, r, c);

    }
}
