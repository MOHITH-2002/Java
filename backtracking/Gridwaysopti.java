public class Gridwaysopti {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int gridways(int row, int col) {
        int rc = (row - 1 + col - 1);
        int rcf = factorial(rc);

        int r = row - 1;
        int rf = factorial(r);

        int c = col - 1;
        int cf = factorial(c);

        int ways = rcf / (r * c);

        return ways;

    }

    public static void main(String[] args) {
        System.out.println(gridways(3, 3));

    }
}

/// time complexity is o(row+col);