import java.util.*;

public class FaultTolerance {
    public static int faultolerance(String s) {
        int pl = 0;
        int pre = -1;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '?')
                continue;
            if (pre == -1 || s.charAt(i) - '0' == pre) {
                pre = s.charAt(i) - '0';
            } else {
                pl++;
                pre = s.charAt(i) - '0';
            }
        }
        return pl;
    }

    public static void main(String[] args) {
        String s = "0101??";
        int result = faultolerance(s);
        System.out.println(result);
    }
}



//C++ Solution
//int faultolerance(string s){
//    int pl=0;
//    int pre=-1;
//    int n=s.size();
//
//    for(int i=0;i<n;i++)
//    {
//        if(s[i]=='?')continue;
//        if(pre==-1 || s[i]-'0'==pre)
//        {
//            pre=s[i]-'0';
//        }
//        else{
//            pl++;
//            pre=s[i]-'0';
//        }
//    }
//    return pl;
//}