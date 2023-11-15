package Recurssion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int d)
    {
        this.data=d;
        this.left=null;
        this.right=null;
    }
}

class tree{


    void insert(int data, TreeNode root) {
        if (root == null) {
            // Create a new node when the root is null
            root = new TreeNode(data);
            return;
        }

        if (data < root.data) {
            if (root.left == null) {
                // Create a new node when the left child is null
                root.left = new TreeNode(data);
            } else {
                // Recursively insert into the left subtree
                insert(data, root.left);
            }
        } else {
            if (root.right == null) {
                // Create a new node when the right child is null
                root.right = new TreeNode(data);
            } else {
                // Recursively insert into the right subtree
                insert(data, root.right);
            }
        }
    }
    int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return Math.max(height(root.left),height(root.right)+1);
    }

    void print(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
    ArrayList<Integer> BFS (TreeNode root)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<TreeNode> q  = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();
            arr.add(temp.data);
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }

        return arr;
    }



}

class test2{
    public static void main(String[] args) {
        System.out.println("Tree");
        TreeNode  root = new TreeNode(1);
        tree ob =new tree();
        ob.insert(2,root);
        ob.insert(4,root);
        ob.insert(5,root);
        ob.insert(3,root);
        ob.insert(6,root);
        ob.insert(7,root);

//        root.left = new Recurssion.TreeNode(2);
//        root.right = new Recurssion.TreeNode(3);
//        root.left.left = new Recurssion.TreeNode(4);
//        root.left.right = new Recurssion.TreeNode(5);

        ob.print(root);
        int h = ob.height(root);
        ArrayList<Integer> arr = ob.BFS(root);
        System.out.println("height "+h);
        System.out.println(arr);

    }
}
