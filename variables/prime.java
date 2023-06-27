
import java.util.*;

public class prime {

    public static int primeNum(int n) {
        int prime = 1;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                prime = 0;
                break;
            }

        }
        return prime;
    }

    public static void primeRange(int n) {
        for (int i = 1; i <= n; i++) {
            if (primeNum(i) == 1) {
                System.out.println(i);

            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeRange(n);

    }
}
