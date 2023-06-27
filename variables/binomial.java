import java.util.*;

public class binomial {

    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;
    }

    public static void bc(int n, int r) {
        int n_fact = fact(n);
        int r_fact = fact(r);
        int n_r_fact = fact(n - r);
        int bc = n_fact / (n_r_fact * r_fact);
        System.out.println("Binomial coefficient is " + bc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = sc.nextInt();
        System.out.println("enter the r value");
        int r = sc.nextInt();
        bc(n, r);

    }
}
