import java.util.*;

public class trappedWater {
    public static int tw(int arr[]) {
        int n = arr.length;
        int lm[] = new int[n];
        lm[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lm[i] = Math.max(lm[i - 1], arr[i]);
        }
        int rm[] = new int[n];
        rm[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rm[i] = Math.max(rm[i + 1], arr[i]);
        }
        int tw = 0;
        for (int i = 0; i < n; i++) {
            int wl = Math.min(lm[i], rm[i]);
            tw += wl - arr[i];
        }
        return tw;
    }

    public static void main(String[] args) {

        int arr[] = { 3, 1, 2, 4, 2, 1, 3 };
        int i = tw(arr);
        System.out.println(i);

    }
}