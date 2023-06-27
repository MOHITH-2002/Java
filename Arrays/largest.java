package Arrays;

import java.util.*;

public class largest {

    public static void max(int n) {
        Scanner sc = new Scanner(System.in);
        int lar[] = new int[10];
        for (int i = 0; i < n; i++) {
            lar[i] = sc.nextInt();
        }
        int max = 0;// or int max = Integer.MIN_VALUE; // - INFINITY

        for (int i = 0; i < n; i++) {
            if (max < lar[i]) {
                max = lar[i];
            }
        }
        System.out.println("the largest element is " + max);

    }

    public static void min(int n) {
        Scanner sc = new Scanner(System.in);
        int min[] = new int[10];// int min = Integer.MAX_VALUE; // + INFINITY
        for (int i = 0; i < n; i++) {
            min[i] = sc.nextInt();
        }
        int minimum = 10000;
        for (int i = 0; i < n; i++) {
            if (min[i] < minimum) {
                minimum = min[i];

            }
        }
        System.out.println("the minimum number is " + minimum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        min(n);

    }
}
