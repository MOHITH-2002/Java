package recursion;

public class SortedOrNot {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int i = 0;
        int arr[] = { 1, 2, 3, 4, 5, 6, 8 };
        System.out.print(isSorted(arr, i));
    }

}
