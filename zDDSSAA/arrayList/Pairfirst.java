import java.util.*;

public class Pairfirst {
    //// o(n^2) time complexity;

    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 7, 8, 10 };

        int target = 16;
        int status = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    status = 1;
                }
            }
        }
        if (status == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
