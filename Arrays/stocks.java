import java.util.*;

public class stocks {
    public static void stock(int sell[]) {
        int maxprofit = 0;
        int buyprice = 0;
        for (int i = 0; i < sell.length; i++) {
            if (buyprice > sell[i]) {
                buyprice = sell[i];

            } else {
                int profit = sell[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }
        }
        System.out.println(maxprofit);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sell[] = new int[n];

        for (int i = 0; i < sell.length; i++) {
            sell[i] = sc.nextInt();
        }
        stock(sell);

    }
}