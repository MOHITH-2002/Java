
import java.util.*;

public class binToDec {
    public static void binTodec(int bin) {
        int mynum = bin;
        int pow = 0;
        int dec = 0;
        while (bin > 0) {
            int ld = bin % 10;
            dec = dec + (ld * (int) Math.pow(2, pow));
            pow++;
            bin = bin / 10;
        }
        System.out.println("the decimal of " + mynum + "is :" + dec);

    }

    public static void decimalTobin(int dec) {

        int pow = 0;
        int bin = 0;
        while (dec > 0) {
            int rem = dec % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            dec = dec / 2;

        }
        System.out.println("DecToBin : " + bin);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decimalTobin(n);
    }
}
