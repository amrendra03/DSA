package Recurssion;

public class Permutation {

    static String swap(String s, int l, int r) {

        StringBuilder str = new StringBuilder(s);
        char x = str.charAt(l);
        char y = str.charAt(r);
        str.setCharAt(l, y);
        str.setCharAt(r, x);

        return str.toString();
    }

    static void permutation(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
            return;
        }
        for (int i = l; i <= r; i++) {
            str = swap(str, l, i);
            permutation(str, l + 1, r);
            str = swap(str, l, i); // Backtrack to restore the original string
        }
    }

    public static void main(String[] args) {
        System.out.println("hello");
        String str = "ABCDE";
        permutation(str, 0, str.length() - 1);
    }
}
