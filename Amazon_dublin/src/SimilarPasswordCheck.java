import java.util.ArrayList;
import java.util.List;

public class SimilarPasswordCheck {
        public static List<String> check(List<String> a, List<String> b) {
            int i = 0, j = 0, k = 0, n = a.size();
            List<String> pl = new ArrayList<>();
            for (i = 0; i < n; i++) {
                j = 0;
                k = 0;
                int an = a.get(i).length();
                int bn = b.get(i).length();
                while (j < an && k < bn) {
                    if (a.get(i).charAt(j) == 'z') {
                        if (b.get(i).charAt(k) == 'a' || b.get(i).charAt(k) == 'z') {
                            j++;
                            k++;
                        } else {
                            j++;
                        }
                    } else if (a.get(i).charAt(j) == b.get(i).charAt(k) || a.get(i).charAt(j) + 1 == b.get(i).charAt(k)) {
                        j++;
                        k++;
                    } else {
                        j++;
                    }
                }
                if (k == bn) {
                    pl.add("YES");
                } else {
                    pl.add("NO");
                }
            }
            return pl;
        }

        public static void main(String[] args) {
            // Test case
            List<String> a = new ArrayList<>();
            List<String> b = new ArrayList<>();
            a.add("abc");
            b.add("abd");
            List<String> result = check(a, b);
            System.out.println(result);
        }
}



//C++ Solution Code
//vector<string>check<vector<string>&a,vector<string>&b)
//        {
//        int i=0,j=0,k=0,n=a.size();
//
//        vector<string>pl;
//        for(int i=0;i<n;i++)
//        {
//        j=0,k=0;
//        int an=a[i].size();
//        int bn=b[i].size();
//
//        while(j<an && k<bn)
//        {
//        if(a[i][j]=='z')
//        {
//        if(b[i][k]=='a' || b[i[k]] == 'z')
//        {
//        j++;
//        k++;
//        }
//        else{
//        j++;
//        }
//        }
//        else if(a[i][j]==b[i][k]||a[i][j]+1==b[i][k])
//        {
//        j++;
//        k++;
//        }
//        else{
//        j++;
//        }
//        }
//        if(k==bn)
//        {
//        pl.puush_back("YES");
//
//        }else{
//        pl.push_back("NO")
//        }
//        return pl;
//        }
//        }