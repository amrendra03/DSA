import java.lang.reflect.Array;
import java.util.ArrayList;

class Main{

    public static ArrayList<String> prettyJSON (String str)
    {
        ArrayList<String> res = new ArrayList<>();

        int backcount = 0;
        int n= str.length();

        StringBuilder temp = new StringBuilder();
        boolean flag = false;
        for(int i=0;i<n;i++)
        {
            char x= str.charAt(i);
            if(x=='[' || x=='{')
            {
                if(flag)
                {
                    res.add(temp.toString());
                    System.out.println(temp);
                }
                // set the temp empty if we get opening brace.
                temp.setLength(0);
                // add indent in string temp
                temp.append(indent(backcount));
                temp.append(x);
                res.add(temp.toString());

                backcount++;
                temp.setLength(0);
                temp.append(indent(backcount));
                flag =  false;
            }
            else if(x==']' || x=='}')
            {
                if(flag)
                {
                    res.add(temp.toString());
                }
                backcount--;
                temp.setLength(0);
                temp.append(indent(backcount));
                temp.append(x);
                res.add(temp.toString());
                temp.setLength(0);
                temp.append(indent(backcount));
                flag=false;
            }
            else if(x==',')
            {
                if(flag)
                {
                    res.add(temp.toString());

                }
                res.set(res.size()-1,res.get(res.size()-1)+",");
                temp.setLength(0);
                temp.append(indent(backcount));
            }
            else {
                temp.append(str.charAt(i));
                flag=true;
            }
        }

        return res;
    }
    static String indent(int n)
    {
        String  res = "";
        while(n>0)
        {
            res+="\t";
            n--;
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println("Json formater");
        String input = "[{\"id\":1,\"first_name\":\"XC90\",\"last_name\":\"Portugal\"},{\"id\":2,\"first_name\":\"Borrego\",\"last_name\":\"France\"},{\"id\":3,\"first_name\":\"rio\",\"last_name\":\"Sweden\"}]";
        System.out.println(input);

        ArrayList <String> res = prettyJSON(input);
        for(String i: res)
        {
            System.out.println(i);
        }
    }
}
