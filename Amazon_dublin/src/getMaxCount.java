import java.util.*;
public class getMaxCount {

//        public static int getMaxCounts(ArrayList<Integer> p, ArrayList<Character> v) {
//            int n = v.size();
//            int x;
//            int pl = 0;
//            HashSet<Long> s = new HashSet<>();
//            for (int i = 0; i < n; i++) {
//                if (v.get(i) == '+') {
//                    if (s.contains(p.get(i)))
//                        return -1;
//                    s.add(p.get(i));
//                } else {
//                    if (!s.contains(p.get(i)))
//                        return -1;
//                    s.remove(p.get(i));
//                }
//                x = s.size();
//                pl = Math.max(pl, x);
//            }
//            return pl;
//        }
    public static int getMaxCounts(ArrayList<Integer> p, ArrayList<Character> v) {
        int n = v.size();
        int x;
        int pl = 0; // Initialize the maximum count of distinct elements
        HashSet<Long> s = new HashSet<>(); // HashSet to track distinct elements

        for (int i = 0; i < n; i++) {
            if (v.get(i) == '+') {
                // If the character is '+', add the corresponding integer to the HashSet
                if (s.contains(p.get(i))) {
                    return -1; // If the integer is already in the set, return -1
                }
                s.add((long)p.get(i));
            } else {
                // If the character is '-', remove the corresponding integer from the HashSet
                if (!s.contains(p.get(i))) {
                    return -1; // If the integer is not in the set, return -1
                }
                s.remove(p.get(i));
            }

            x = s.size(); // Get the current count of distinct elements
            pl = Math.max(pl, x); // Update the maximum count if necessary
        }

        return pl; // Return the maximum count of distinct elements
    }


    public static void main(String[] args) {

            ArrayList<Integer> p=new ArrayList<>();
            ArrayList<Character> v= new ArrayList<>();
            System.out.println(getMaxCounts(p,v));
    }
}


// C++ Solution code
//{
//        int n=v.size();
//        int x;
//        int pl=0;
//        set<long>s;
//        for(int i=0;i<n;i++)
//        {
//        if(v[i]=='+')
//        {
//        if(s.find(p[i])!=s.end())
//        return -1;
//        s.insert(p[i]);
//        }
//        else{
//        if(s.find(p[i])==s.end())
//        return -1;
//        s.erase(p[i]);
//        }
//        x=s.size();
//        pl=max(pl,x);
//        }
//        return pl;
//
//        }