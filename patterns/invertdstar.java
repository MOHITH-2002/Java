import java.util.*;

public class invertdstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int line = 1; line <= n; line++) {
        // for (int star = 1; star <= n - line + 1; star++) {// n-line +1 vip formula
        // ................
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= n - line + 1; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
