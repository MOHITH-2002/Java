public class Permutation {
    public static void permutationString(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
        }
        for (int i = 0; i < str.length(); i++) {
            /// abc

            char curr = str.charAt(i);// b
            /// a c = ac
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permutationString(newstr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutationString(str, "");
    }
}
