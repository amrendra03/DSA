package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    //Recursion approach
    static void combination(int arr[], int i, ArrayList<Integer> list)
    {
        //Base case to break recursion
        if(i==arr.length)
        {
            //printing all sub set
            System.out.println(list);
            return ;
        }
        // add arr[index] by forward recursion
        list.add(arr[i]);
        combination(arr,i+1,list);

        //Backtracking remove items from list
        list.remove(list.size()-1);
        combination(arr,i+1,list);
    }




    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n=3;
        ArrayList<Integer> list =new ArrayList<>();
        combination(arr,0,list);

        //iterative aproach
        System.out.println("iteration");

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList());

        for(int num:arr)
        {
            int s=res.size();
            for(int i=0;i<s;i++)
            {
                List<Integer> temp = new ArrayList(res.get(i));
                temp.add(num);
                res.add(temp);

            }
        }
        System.out.println(res);
    }

}
