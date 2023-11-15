package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void powerset(int[] arr, int i, List<Integer> curr) {
        if (i == arr.length) {
            int sum=0;
            for(int j: curr)
            {
             sum+=j;
            }
            if(sum==0)
            {
                System.out.println(curr);
            }
            return;
        }
        List<Integer> newCurr = new ArrayList<>(curr);
        newCurr.add(arr[i]);
        powerset(arr, i + 1, newCurr);
        powerset(arr, i + 1, curr);
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,5,5,0};
        powerset(arr, 0, new ArrayList<>());
    }
}
