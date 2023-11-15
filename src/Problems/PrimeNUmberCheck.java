package Problems;

public class PrimeNUmberCheck {
    public static void main(String[] args) {
        System.out.println("prime number check...");

        int n = 177;

        for(int i=2;i<=n/2;i++)
        {
//            System.out.println(n+" / "+i+" "+n/i);
            if(n%i==0)
            {
                System.out.println("not prime number "+n +" divisible by "+i);
            }
        }


    }
}
