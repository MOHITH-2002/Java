package recursion;

import java.util.*;

public class XtothepowN {
    public static int xToThePowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnmin1 = xToThePowerN(x,n-1);
        // int xn = x * xnmin1;
        // return xn;
        return x * xToThePowerN(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(xToThePowerN(2, 10));

    }
}
