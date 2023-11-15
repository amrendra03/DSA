import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetMinWildCard {
    public static int getMinWildCard(List<String> v) {
        int n = v.get(0).length();
        int pl = 0;
        Map<Integer, Map<Integer, Integer>> mp = new HashMap<>();
        for (String it : v) {
            for (int i = 0; i < n; i++) {
                if (it.charAt(i) != '?') {
                    if (!mp.containsKey(i)) {
                        mp.put(i, new HashMap<>());
                    }
                    mp.get(i).put((int) it.charAt(i), mp.get(i).getOrDefault((int) it.charAt(i), 0) + 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(i) && mp.get(i).size() >= 2) {
                pl++;
            }
        }
        return pl;
    }

    public static void main(String[] args) {
        List<String> v = new ArrayList<>();
        v.add("example1");
        v.add("example2");
        // Add more elements to the list if needed
        int result = getMinWildCard(v);
        System.out.println(result);
    }
}

//C++ Solution
//int getMinWildCard(vector<string>&v)
//{
//    int n=v[0].size();
//    int pl=0;
//    map<int,map<int,int>>mp;
//    for(auto it:v)
//    {
//        for(int i=0;i<n;i++)
//        {
//            if(it[i]!='?')
//            {
//                mp[i][it[i]]++;
//            }
//        }
//    }
//    for(int i=0;i<n;i++)
//    {
//        if(mp[i].size()>=2)
//        {
//            pl++;
//        }
//    }
//    return pl;
//}