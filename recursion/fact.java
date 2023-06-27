package recursion;

import java.util.*;

public class fact {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int f = n * factorial(n - 1);
        return f;

    }

    public static void main(String[] args) {
        int f = factorial(5);
        System.out.println(f);
    }

}
