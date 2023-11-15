package Recurssion;

import java.util.ArrayList;

public class Subsequence {
    static void powerset(String s,int i,String curr)
    {
        if(i==s.length())
        {
            System.out.println(curr);
            return ;
        }
        powerset(s,i+1,curr+s.charAt(i));
        powerset(s,i+1,curr);
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        String str="hello";
        String curr="";
        powerset(str,0,curr);

    }

}
