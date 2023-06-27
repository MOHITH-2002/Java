import java.util.*;

public class revrese {
    public static void reverse_arr(int n, int arr[]) {
        System.out.println(arr.length);
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int tmp = arr[last];
            arr[last] = arr[first];
            arr[first] = tmp;
            last--;// first we should decrement otherwise it will print all 0;
            first++;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the elemnts ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("hello");
        reverse_arr(n, arr);

    }
}