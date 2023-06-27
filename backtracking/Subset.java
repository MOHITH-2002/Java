public class Subset {

    public static void subset(String str, String ans, int i) {
        if (str.length() == i) {

            if (ans.length() == 0) {
                System.out.println("empty set");
            } else {
                System.out.println(ans);
            }
            return;
        }

        subset(str, ans + str.charAt(i), i + 1);// yes condition
        subset(str, ans, i + 1);/// no condition

        /// logic in notes
    }

    public static void main(String[] args) {
        String str = "abc";
        subset(str, "", 0);
    }
}
