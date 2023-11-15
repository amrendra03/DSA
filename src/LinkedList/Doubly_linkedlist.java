package LinkedList;

import java.util.Scanner;

class NodeB {
    int data;
    String name;
    NodeB next;
    NodeB prev;
    NodeB(int n){
        this.data=n;
        this.next=null;
        this.prev=null;

    }
    NodeB(int d, String n){
        this.data=d;
        this.name=n;

        this.next=null;
        this.prev=null;
    }

}

class linkedlist_D{
    NodeB head;
    void insert(int data,String name)
    {
        NodeB newNode = new NodeB(data);
        if(this.head==null)
        {
            this.head=newNode;

        }
        else {
            NodeB temp=this.head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            newNode.prev=temp;
            temp.next=newNode;
        }

    }
    void print(){
        while (this.head.next!=null)
        {
            System.out.println(" -> "+this.head.data);
            this.head=this.head.next;
        }
        System.out.println(" -> "+this.head.data);
        System.out.println("Previous------");
        while(this.head.prev!=null) {
            System.out.println(" -> " + this.head.data);
            this.head = this.head.prev;
        }
        System.out.println(" -> "+this.head.data);

    }

}

public class Doubly_linkedlist {
    public static void main(String[] args) {

        System.out.println("--! Main !---");
        int a;
        Scanner sc = new Scanner(System.in);


//        System.out.println("Enter Element");
//        int n=sc.nextInt();
        linkedlist_D list =new linkedlist_D();
        list.insert(10,"a");
        list.insert(9,"b");
        list.insert(5,"c");
        list.insert(80,"d");
        list.insert(70,"e");
        list.insert(20,"f");
        list.print();



    }
}