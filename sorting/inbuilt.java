import java.util.Arrays;
import java.util.Collections;

public class inbuilt {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 40, 2, 1, 3, 4, 9, 11, 20 };

        Arrays.sort(arr);///// ascending sort this is the best sorting compared to bubble sort order

        Arrays.sort(arr, 0, 3);/// 0 include and index 3 exclusive
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //// to reverse order sort

        // we must use object class
        // import java.util.Collections;
        Integer arr1[] = { 10, 20, 40, 2, 1, 3, };
        Arrays.sort(arr1, Collections.reverseOrder());
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
//// both of them having good time complexity of this algorithm is o(log n)
