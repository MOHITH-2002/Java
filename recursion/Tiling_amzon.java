package recursion;

public class Tiling_amzon {
    public static int tilingArrangement(int n) {
        if (n == 0 || n == 1) { // base case
            return 1;
        }
        int nm1 = tilingArrangement(n - 1); /// f(n-1) = 2 *(n-1);
        int nm2 = tilingArrangement(n - 2); /// f(n-1) = 2 *(n-2);
        int ways = nm1 + nm2;
        return ways;

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingArrangement(n));

    }

}
