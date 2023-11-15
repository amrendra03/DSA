package Recurssion;

public class coin_change {

    static int minCoin(int n,int arr[])
    {
        if(n==0)return 0;
        int ans = Integer.MAX_VALUE;

        for(int i=-0;i<arr.length;i++)
        {
            if(n-arr[i]>=0)
            {
                int subAns =minCoin(n-arr[i],arr);
                if(subAns != Integer.MAX_VALUE && subAns+1<ans)
                {
                    ans = subAns+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int coins[]={1,2,3};
        int sum=3;

        long curr[]=new long[sum+1];
        curr[0]=1;
        for(int coin:coins)
        {
            System.out.println("c "+coin+" sum "+sum);
            for(int i=coin;i<=sum;i++)
            {

                curr[i]+=curr[i-coin];
                System.out.println("i "+i+" curr[i] "+curr[i]+" coin "+coin);
            }
            System.out.println();
        }
        System.out.println(curr[sum]);

//        System.out.println(minCoin(n,arr));

    }

}
