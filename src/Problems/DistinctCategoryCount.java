package Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctCategoryCount {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int totalCount = getTotalDistinctCount(arr);
        System.out.println(totalCount);
    }

    public static int getTotalDistinctCount(int[] arr) {
        int totalCount = 0;
        for (int start = 0; start < arr.length; start++) {
            Set<Integer> set = new HashSet<>();
            for (int end = start; end < arr.length; end++) {
                set.add(arr[end]);
                totalCount += set.size();
                System.out.println(set);
            }
        }

        return totalCount;
    }
}
