import java.util.*;

public class staircase_Search {

    public static void stairCase(int matrix[][], int r, int c) {
        int key = 65;
        int row = 0;
        int col = c - 1;
        int status = 0;
        while (row < r && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("key found at  (" + row + "," + col + ")");
                status = 1;
                break;

            } else if (key < matrix[row][col]) {
                col--;
            } else if (key > matrix[row][col]) {
                row++;
            }
        }
        if (status == 0) {
            System.out.println("not found value");
        }

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
            System.out.println(" ");
        }
        stairCase(matrix, r, c);
    }

}
