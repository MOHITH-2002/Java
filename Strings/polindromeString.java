package Strings;

import java.util.*;

public class polindromeString {
    public static void main(String[] args) {
        String str = "gada";
        int n = str.length();
        int status = 0;

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("false");
                status = 1;
                break;
            }

        }
        if (status == 0) {
            System.out.println("true");

        }
    }
}
