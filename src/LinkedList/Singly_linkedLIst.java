package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

class NodeA{
    int data;
    String name;
    NodeA next;
    NodeA(int d,String n){
        this.data=d;
        this.name=n;

        this.next=null;
    }

}

class linkedlistS{
    NodeA head;
    void insert(int data,String name)
    {
        NodeA newNode = new NodeA(data,name);
        if(this.head==null)
        {
            this.head=newNode;

        }
        else {
            NodeA temp=this.head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }

    }
    void print(){
        NodeA head2=this.head;
        while (head2!=null )
        {
            System.out.println(head2.name+" -> "+head2.data);
            head2=head2.next;
        }
        //System.out.println(head2.name+" -> "+head2.data);
    }
    static void swap(NodeA prevX, NodeA x, NodeA prevY, NodeA y) {
        if (x == null || y == null || x == y) {
            return;
        }

        // Update the next pointers of previous nodes
        if (prevX != null) {
            prevX.next = y;
        }

        if (prevY != null) {
            prevY.next = x;
        }

        // Update the next pointers of the nodes being swapped
        NodeA temp = x.next;
        x.next = y.next;
        y.next = temp;
    }


    void sort() {
//        if (head == null || head.next == null) {
//            // The LinkedList.list is empty or has only one node, no need to sort
//            return;
//        }
//
//        LinkedList.NodeA currentNode = head;
//        LinkedList.NodeA nextNode;
//
//        while (currentNode != null) {
//            nextNode = currentNode.next;
//            while (nextNode != null) {
//                if (currentNode.data > nextNode.data) {
//                    // Swap the nodes
//                    if (currentNode == head) {
//                        head = nextNode;
//                    } else {
//                        LinkedList.NodeA prevCurrent = findPreviousNode(currentNode);
//                        prevCurrent.next = nextNode;
//                    }
//
//                    currentNode.next = nextNode.next;
//                    nextNode.next = currentNode;
//                    currentNode = nextNode; // Update the currentNode to continue from the swapped node
//                }
//                nextNode = nextNode.next;
//            }
//            currentNode = currentNode.next;
//        }
        NodeA temp=this.head;

        while(temp!=null)
        {

            NodeA temp2=temp;

            while(temp2!=null)
            {
                if(temp.data<temp2.data)
                {
                    NodeA temp3 =temp.next;
                    temp.next=temp2.next;
                    temp2.next=temp3;
                    System.out.println(temp3.data);
                }
                //System.out.println("test  "+temp2.data);
                temp2=temp2.next;

            }
            temp=temp.next;
        }
    }

    private NodeA findPreviousNode(NodeA target) {
        NodeA current = head;
        NodeA previous = null;

        while (current != null && current != target) {
            previous = current;
            current = current.next;
        }

        return previous;
    }


    void deleteNode(int n)
    {
        NodeA prev=null;
        NodeA curr=this.head;
        while(curr!=null)
        {
            if(prev==null && curr.data==n)
            {
                NodeA temp=curr.next;
                curr.next=null;
                this.head=temp;
                break;
            }

            if(curr.data==n)
            {

                NodeA temp=curr.next;
                prev.next=temp;
            }

            prev=curr;
            curr=curr.next;
        }

    }

    NodeA temp;
    void reverse(NodeA list,LinkedList<Integer> res,int i,NodeA temp)
    {
        if(i<=0 || list==null)
        {
            return ;
        }

        reverse(list.next,res,i-1, temp);
        NodeA newNode = new NodeA(list.data,list.name);
//        System.out.println(LinkedList.list.data);
        if(temp==null)
        {
            System.out.println(list.data);
            temp=newNode;
        }else{
           NodeA last = temp;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            System.out.println(temp.data);
            temp.next=newNode;
        }
        res.add(list.data);

    }

    NodeA reverse(NodeA head,int i,int k) {
        NodeA prev = null;
        NodeA current = head;
        NodeA nextNode = null;


        while (current != null) {

            nextNode = current.next; // Store the next node
            current.next = prev;     // Reverse the pointer

            // Move to the next nodes
            prev = current;
            current = nextNode;

        }
        System.out.println(nextNode.data);

        // The new head of the reversed LinkedList.list is the last node (prev)
        return prev;
    }

    NodeA count(NodeA root,int i)
    {
        if(root==null)
        {
            return root;
        }
        if(i<4)
        {
            count(root.next,i);
            i+=1;

        }
        return root;
    }

}
 class Sinly_linkedLIst {
    public static void main(String[] args) {
        System.out.println("---! Singly LinkedList !---");
        int a;
        Scanner sc = new Scanner(System.in);
         linkedlistS list = new linkedlistS();
            list.insert(10, "a");
            list.insert(9, "b");
            list.insert(5, "c");
            list.insert(80, "d");
            list.insert(70, "e");
            list.insert(30, "f");
            list.insert(20, "g");
            list.insert(40, "h");

    NodeA ans = list.count(list.head,0);
        System.out.println(ans.data+" "+ans.name);


    }
}