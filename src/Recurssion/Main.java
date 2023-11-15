package Recurssion;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static ArrayList<String> permutation(String S) {
        // Code Here
        ArrayList<String> arr = new ArrayList<>();
        return arr;
    }

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(str);
//        permutation(str);
        ArrayList<String> arr = new ArrayList<>();

        StringBuilder str2 = new StringBuilder(str);
        StringBuilder s2 = new StringBuilder(str2);

        int n = str2.length();
        int k = 1;

        for (int i = 0; i < n; i++) {
            StringBuilder s = new StringBuilder(str2);
            s.insert(i + 1, " ");

            arr.add(s.toString());

        }
        arr.add(s2.toString());
        System.out.println(arr.contains("ABCD "));
        arr.add(str2.toString());
        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}