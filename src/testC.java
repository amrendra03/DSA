import java.util.ArrayList;
import java.util.List;

public class testC {
    public static void main(String[] args) {
        System.out.println("arr");
        int arr[]={12,1,2,3,0};
        int n=arr.length;

        int i=0;
        int j=i+1;
        int k=n-1;
        int count=0;

        List<Integer> res = new ArrayList<>();
//        while(i<n-3)
//        {
//           System.out.print(" i "+arr[i]);
//            if(j<k)
//            {
//                System.out.print(" j " +arr[j]);
//                if(arr[i]>arr[j]) count+=1;
//                j+=1;
//            }
//            if (k>j) {
//                System.out.print(" k "+arr[k]);
//                if(arr[i]>arr[k]) count+=1;
//                k-=1;
//
//            }
//            if(j>=k)
//            {
//                if(j==n)
//                {
//                    System.out.println("break");
//                    break;
//                }
//                if(arr[i]>arr[j]) count+=1;
//                res.add(count);
////                System.out.println(" -- "+ arr[j]+ " "+count);
//                i+=1;
//                j=i+1;
//                k=n-1;
//                count=0;
//            }
//            System.out.println();
//        }


        while (i < n - 1) {
            System.out.print(" i " + arr[i]);
            int s = n - i;
            j = i + 1;

            // First, print elements from the beginning
            while (j < s / 2) {
                System.out.print(" j " + arr[j]);
                j += 1;
            }

            // Then, print elements from the middle
            k = s - 1;
            while (k >= s / 2) {
                System.out.print(" k " + arr[k]);
                k -= 1;
            }
            i += 1;
            System.out.println();
        }

        if(arr[n-3]>arr[n-2] && arr[n-3]>arr[n-1])
        {
            res.add(2);
        }else if(arr[n-3]>arr[n-1] || arr[n-3] >arr[n-2]){
            System.out.println("---");
            res.add(1);
        } else {
            res.add(0);
        }

        if(arr[n-2]>arr[n-1])
        {
            res.add(1);
        }else{
            res.add(0);
        }
        res.add(0);
        System.out.println(res);
    }
}
