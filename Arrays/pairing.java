package Arrays;

import java.util.*;

public class pairing {

    public static void pairing_pattern(int n, int arr[]) {
        for (int i = 0; i < n; i++) {
            int cur = arr[i];
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + cur + "," + arr[j] + ")");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        pairing_pattern(n, arr);
    }
}
