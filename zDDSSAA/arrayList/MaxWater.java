import java.util.*;

public class MaxWater {
    public static void maxWater(ArrayList<Integer> height) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int high = Math.min(height.get(i), height.get(j));// index value height.get(i),height.get(j)
                int width = j - i;

                int curWater = high * width;// area max water container;
                max = Math.max(max, curWater);/// comparison with max water and current water

            }

        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<Integer>();

        height.add(1);
        height.add(9);
        height.add(4);
        height.add(7);
        height.add(11);
        height.add(13);
        height.add(0);
        height.add(2);
        height.add(15);
        maxWater(height);
    }
}
