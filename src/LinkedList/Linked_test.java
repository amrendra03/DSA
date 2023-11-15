package LinkedList;

class Node{
    String data;
    Node next;
    public  Node(String s)
    {
        this.data=s;
        this.next=null;
    }

}
class pair{
    int a;
    String s;
    public pair(int a,String s)
    {
        this.a=a;
        this.s =s;
    }

}


class list{
    Node head;
    void insert(String name)
    {
        Node newNode = new Node(name);
        if(this.head==null)
        {
            this.head=newNode;

        }
        else {
            Node temp=this.head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }

    }
    void print(){
        Node head2=this.head;
        while (head2!=null )
        {
            System.out.println(" -> "+head2.data);
            head2=head2.next;
        }

    }

    static String res ="";
    int reversecount(Node node, int k, String[] result) {
        if (node == null) {
            return 0; // Base case: Reached the end of the LinkedList.list
        }
        int positionFromEnd = 1 + reversecount(node.next, k, result);

       if (positionFromEnd == k) {
            result[0] = node.data; // Update the result with the kth node's data
        }

        return positionFromEnd;
    }
}

class  Linked_test{

    public static void main(String[] args) {
        System.out.println("Linked List");
        list list = new list();
        list.insert("a");
        list.insert("b");
        list.insert("c");
        list.insert("d");
        list.insert("e");
        list.insert("f");
        list.insert("g");

        list.print();

        String arr[]={""};
        int i = list.reversecount(list.head,0,arr);
        System.out.println("ans: "+arr[0]);
        System.out.println(i);


    }
}
