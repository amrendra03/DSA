import java.util.HashMap;

public class GetDiscountPairs {
    public static long getDiscountPairs(int x, int[] v) {
        int n = v.length;
        long pl = 0, sto = 0;
        HashMap<Integer, Long> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sto = v[i] % x; // Calculate the remainder when dividing by x

            if (sto == 0) {
                pl += mp.getOrDefault(0, 0L); // Increment pl using the count of elements with remainder 0
            } else {
                pl += mp.getOrDefault(x - sto, 0L); // Increment pl using the count of elements with the complementary remainder
            }

            mp.put((int)sto, mp.getOrDefault(sto, 0L) + 1); // Increment the count of elements with the current remainder
        }

        return pl; // Return the total number of discount pairs
    }

    public static void main(String[] args) {
        int x = 3; // Set the divisor
        int[] v = {3, 6, 9, 12}; // Sample input array

        long result = getDiscountPairs(x, v);

        System.out.println("Total discount pairs: " + result);
    }
}



//C++ Solution
//long getdiscountPairs(int x,vector<int>v)
//{
//    int n=v.size();
//    long pl=0,sto=0;
//    map<int,long>mp;
//    for(int i=0;i<n;i++)
//    {
//        sto =v[i]%x;
//        if(sto==0)
//        {
//            pl=pl+mp[0];
//        }else{pl=pl+mp[x-sto]}
//        mp[sto]++;
//    }
//    return pl;
//}