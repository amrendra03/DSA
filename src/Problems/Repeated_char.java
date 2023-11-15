package Problems;

public class Repeated_char {
    static int repeat(String str)
    {
        int n=str.length();
        int count=1;
        int num=0;
        char x=str.charAt(0);
        for(int i=1;i<n;i++)
        {
            char x2=str.charAt(i);
            if(x2==x)
            {
                count++;
                x=x2;
                continue;
            }
            if(x2!=x)
            {
                if(count>=3)
                {
                    num+=count-2;
                }
                count=1;
            }
            x=x2;
        }
        if(count>=3)
        {
            num+=count-2;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println("check repeated str");

        String str="bbaaaaaaaaaaaaaaaccc";
        int count=0;
        int replace = repeat(str);
        if(replace>3)
        {
            if(replace%3!=0)
            {
                replace/=3;
                replace+=1;
            }
            else{
                count+=replace/3;
            }
            count+=replace;
        }
        else{
            count+=replace;
        }
        System.out.println(count);
    }
}
