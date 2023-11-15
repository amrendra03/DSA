package Problems;

import java.util.*;

public class PrimeConstructor {
    static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static long findPrime(int[] arr) {
        Arrays.sort(arr);
        int q = arr[0];
        boolean isEven = q % 2 == 0;
        if (isEven) {
            return -1; // Return -1 if q is even
        }
        for (long i = q + 1;; i++) {
            boolean flag = true;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] != q && i % arr[j] != q) {
                    flag = false;
                    break;
                }
            }
            if (flag && isPrime(i)) {
                return i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = input.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        long result = findPrime(arr);
        if (result == -1) {
            System.out.println("None");
        } else {
            System.out.println(result);
        }
    }
}
