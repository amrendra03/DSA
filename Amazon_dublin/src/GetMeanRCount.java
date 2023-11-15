import java.util.HashMap;
import java.util.Map;
import java.util.Vector;


public class GetMeanRCount {
        public static Vector<Integer> getMeanRankCount(Vector<Integer> v) {
            int n = v.size();
            Map<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                double sum = 0, x = 0;
                for (int j = i; j < n; j++) {
                    sum = sum + v.get(j);
                    x = sum / ((j - i + 1) * 1.0);
                    if (Math.ceil(x) == Math.floor(x)) {
                        mp.put((int) x - 1, mp.getOrDefault((int) x - 1, 0) + 1);
                    }
                }
            }
            Vector<Integer> pl = new Vector<>();
            for (int i = 0; i < n; i++) {
                pl.add(mp.getOrDefault(i, 0));
            }
            return pl;
        }

        public static void main(String[] args) {
            // Test the function
            Vector<Integer> v = new Vector<>();
            v.add(1);
            v.add(2);
            v.add(3);
            v.add(4);
            v.add(5);
            Vector<Integer> result = getMeanRankCount(v);
            System.out.println(result);
        }
}


// C++ Solutiion code
//vecotr<int> getMeanRankCount(vector<int>v)
//{
//    int n=v.size();
//    unorder_map<int,int>mp;
//    for(int i=0;i<n;i++)
//    {
//        double sum=0,x=0;
//        for(int j=i;j<n;j++)
//        {
//            sum=sum+v[j];
//            x=sum/((j-i+1)*1.0);
//            if(ceil(x)==floor(x))
//            {
//                mp[x-1]++;
//            }
//
//        }
//    }
//    vector<int>pl(n);
//    for(int i=0;i<n;i++)
//    {
//        pl[i]=mp[i];
//    }
//    return pl;
//}