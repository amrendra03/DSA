package Binery_tree;

import java.util.LinkedList;
import java.util.Queue;

class NodeC {
    int data;
    NodeC left;
    NodeC right;
    NodeC(int n)
    {
        this.data=n;
        this.left=null;
        this.right=null;
    }

}
class tree
{

    void insert(NodeC root, int n)
    {

        if(root==null)
        {
            root=new NodeC(n);
            return ;//new Node(n);
        }
        if(root.data>n)
        {
            if(root.left==null)
            {
                root.left=new NodeC(n);
            }else{
                insert(root.left,n);
            }
        }
        else
        {
            if(root.right==null)
            {
                root.right=new NodeC(n);
            }
            else{
                insert(root.right,n);
            }
        }
        //return root;
    }
    void print(NodeC root)
    {
        if(root==null)
        {
            return;
        }

        print(root.left);
        print(root.right);
        System.out.println(root.data+" :-");

    }
    void printCurrentLevel(NodeC root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }
    public  void bfs(NodeC root) {
        if (root == null) {
            return;
        }

        Queue<NodeC> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            NodeC current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }

}
public class BST {

    public static void main(String[] args) {
        tree tree=new tree();
        NodeC root = new NodeC(1);

        tree.insert(root,2);
        tree.insert(root,3);
        tree.insert(root,4);
        tree.insert(root,5);
        tree.insert(root,6);


        tree.print(root);
        System.out.println("--BFS--");
        tree.printCurrentLevel(root,3);

        System.out.println("=== BFS ===");
        tree.bfs(root);
    }
}