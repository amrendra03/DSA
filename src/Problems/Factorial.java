package Problems;

import java.util.ArrayList;

public class Factorial {
    static long factorial (long n)
    {
        if(n<=1)
        {
            return 1;
        }

        return n*factorial(n-1);
    }

   static  boolean palindrome(String s,int l,int r)
   {
       if(l>=r)
       {
           return true;
       }
       if(s.charAt(l)!= s.charAt(r))
           return false;
       return palindrome(s,l+1,r-1);

   }


    public static void main(String[] args) {
        String str="ababa";
        String str2="";
        System.out.println(palindrome(str,0,str.length()-1));

    }
}
