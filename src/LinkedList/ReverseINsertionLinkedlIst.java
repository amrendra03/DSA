package LinkedList;

import java.util.LinkedList;

class NodeAB {
    int data;
    String name;
    NodeAB next;

    NodeAB(int data, String name) {
        this.data = data;
        this.name = name;
    }
}

public class ReverseINsertionLinkedlIst {
    static void reverseInsertion(NodeAB list, LinkedList<Integer> res, int i, NodeAB temp) {
        if (i <= 0 || list == null) {
            return;
        }

        reverseInsertion(list.next, res, i - 1, temp);

        NodeAB newNode = new NodeAB(list.data, list.name);
        if (temp == null) {
            // If temp is null, it means we're inserting the first node.
            temp = newNode;
        } else {
            System.out.println(list.data);
            // Find the last node in the temp LinkedList.list and append the newNode.
            NodeAB last = temp;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

        // Add the data to the ArrayList
        res.add(list.data);
    }

    public static void printLinkedList(NodeAB head) {
        NodeAB current = head;
        while (current != null) {
            System.out.print("(" + current.data + ", " + current.name + ") -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        NodeAB list = new NodeAB(1, "Alice");
        list.next = new NodeAB(2, "Bob");
        list.next.next = new NodeAB(3, "Charlie");
        list.next.next.next = new NodeAB(4, "David");
        list.next.next.next.next = new NodeAB(5, "Eve");

        LinkedList<Integer> resultList = new LinkedList<>();
        NodeAB reversedList = null;

        reverseInsertion(list, resultList, Integer.MAX_VALUE, reversedList);

        System.out.println("Original Linked List:");
        printLinkedList(list);

        System.out.println("Reversed and Inserted Linked List:");
        printLinkedList(reversedList);

        System.out.println("Result ArrayList:");
        System.out.println(resultList);
    }
}
