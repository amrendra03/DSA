package Recurssion;

import java.util.Arrays;

public class triple_Sum_subarray {
    public static boolean find3Numbers(int arr[], int n, int X) {
        // Your code Here
        Arrays.sort(arr);
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            int l=i+1;
            int r=n-1;
            while(l<r)
            {
                int sum=arr[i]+arr[l]+arr[r];
                if(sum==X)return true;
                else if(sum>X) r--;
                else l++;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int x=7;
        find3Numbers(arr,arr.length,x);

    }
}
