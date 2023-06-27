package recursion;

public class SumOfFirstNnat {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }

        int f = n + sum(n - 1);
        return f;

    }

    public static void main(String[] args) {
        int f = sum(10);
        System.out.println(f);
    }
}
