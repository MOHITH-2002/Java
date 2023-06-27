package recursion;

public class FirstOccurance {
    public static int getFirstOccurance(int arr[], int i, int key) {
        if (i == arr.length) { /// base case
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return getFirstOccurance(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int i = 0;
        int key = 5;
        int arr[] = { 9, 2, 10, 47, 3, 0, };
        System.out.print(getFirstOccurance(arr, i, key));
    }
}
