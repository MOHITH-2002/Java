import java.util.*;

public class Histogram {

    public static void histogram(int arr[]) {

        Stack<Integer> s = new Stack<>();
        int maxarea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // nest smaller right

        for (int i = arr.length - 1; i >= 0; i--) {
            // while(!s.isEmpty() && arr[s.peek()]<=arr[i]){ this is nest greater
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) { // changing >= sign will be nest smaller
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);

        }

        // nest smaller left
        s = new Stack<>();// initializing to zero

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        /// find area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;// width=j-i-1;//all are indexing
            int area = height * width;
            maxarea = Math.max(maxarea, area);
        }
        System.out.println("the max area of histogram is " + maxarea);

    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 3, 4 };
        histogram(arr);
    }

}
