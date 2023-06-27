package recursion;

public class Decresing {
    public static void factDec(int n) {
        if (n == 1) {
            System.out.print(" " + n);
        } else {
            System.out.print(" " + n);
            factDec(n - 1);/// vvvviiippppppppppp
        }
    }

    public static void main(String[] args) {
        int n = 10;
        factDec(10);
    }
}
