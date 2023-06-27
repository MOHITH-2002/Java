package recursion;

public class Increasing {
    public static void factInc(int n) {
        if (n == 1) {
            System.out.print(" " + n);
        } else {
            factInc(n - 1);
            System.out.print(" " + n);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        factInc(10);
    }

}
