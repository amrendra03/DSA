package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackPractice {

    static void del(Stack s,int n)
    {
        if(s.isEmpty() || n==0)
        {
            s.pop();
            return;
        }
        int x=(int)s.pop();
        del(s,n-1);
        s.push(x);


    }
    static void bottom(Stack s,int e)
    {
        if(s.isEmpty())
        {
            s.push(e);
            return;
        }
        int x=(int)s.pop();
        //System.out.println(x);
        bottom(s,e);
        s.push(x);

    }

    static  void reverse(Stack s)
    {
        if(s.isEmpty())
            return;
        int x=(int) s.pop();
        reverse(s);
        bottom(s,x);
    }

    static void sortRecursive (Stack s)
    {
        if(s.isEmpty())
            return;
        int x=(int)s.pop();
        sortRecursive(s);
        if (!s.isEmpty() && x < (int)s.peek()) {
            bottom(s, x);
        } else {
            s.push(x);
        }


    }
    static void sort(Stack stack){
        Stack<Integer> s2 = new Stack<>();

        while (!stack.isEmpty()) {
//            System.out.println("-----------");
            //System.out.println(s2);
            int z = (int) stack.pop();
            if (s2.isEmpty()) {
                s2.push(z);
            } else if (z < s2.peek()) {
//                System.out.println("s2p " + s2.peek() + " >z " + z);
                s2.push(z);
            } else {

                Stack<Integer> s3 = new Stack<>();
                while (!s2.isEmpty()) {
//                    System.out.println("s " + s2 + " z " + z);

                    if (z < s2.peek()) {
//                        System.out.println("v");
                        //s2.push(z);
                        break;
                    }
                    s3.push(s2.pop());
                }
                s2.push(z);
//                System.out.println("s2E " + s2);
//                System.out.println("s3 " + s3);
                while (!s3.isEmpty()) {
                    s2.push(s3.pop());
                }

            }
        }
        System.out.println("sort "+s2);
    }



    public static void main(String[] args)
    {
        Stack<Integer> stack =new Stack<>();

        stack.add(90);
        stack.add(30);
        stack.add(70);
        stack.add(60);
        stack.add(70);


        int n= stack.size();
        n=n/2;
//        int x=90;
        System.out.println(stack);
        del(stack,n);
        System.out.println("del "+stack);
        bottom(stack,10);
        System.out.println("botm "+stack);
        reverse(stack);
        System.out.println("Revers "+stack);
        sortRecursive(stack);
        System.out.println(stack);




    }


}
