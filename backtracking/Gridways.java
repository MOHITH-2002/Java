public class Gridways {
    public static int gridWays(int i, int j, int row, int col) {

        // base
        if (i == row - 1 && j == col - 1) {//// condn for last cell
            return 1;
        } else if (i == row || j == col) { /// boundry cross condn
            return 0;
        }

        ////////////////////////

        int w1 = gridWays(i + 1, j, row, col);
        int w2 = gridWays(i, j + 1, row, col);
        return w1 + w2;

    }

    public static void main(String[] args) {
        int row = 4, col = 4;

        int ways = gridWays(0, 0, row, col);
        System.out.println(ways);
    }
}
/// time complexity is 2^(row+col); that is expontential
