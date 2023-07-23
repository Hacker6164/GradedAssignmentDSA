package DSA;


import java.util.HashSet;

class Node {
    public Object item;
    public Node next;

    public Node() {
        this.item = null;
        this.next = null;
    }
}

public class RemoveDuplicatesInLL {
    private int size;
    private Node head;

    public RemoveDuplicatesInLL() {
        this.size = 0;
        this.head = null;
    }

    public void insertingnode(String i) {
        Node node = new Node();
        node.item = i;
        Node current = this.head;

        if (this.head == null) {
            this.head = node;
            this.head.next = null;
            this.size = 1;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.next = null;
            this.size += 1;
        }
    }

    public void removeDuplicates() {
        if (head == null) {
            return; // No duplicates to remove from an empty list
        }

        Node current = head;
        Node prev = null;
        HashSet<String> uniqueElements = new HashSet<>();

        while (current != null) {
            String currentItem = (String) current.item; // Assuming the items in the list are strings

            if (uniqueElements.contains(currentItem)) {
                // Duplicate element found, remove the node
                prev.next = current.next;
                current = current.next;
                size--;
            } else {
                uniqueElements.add(currentItem);
                prev = current;
                current = current.next;
            }
        }
    }

    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.item + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveDuplicatesInLL myList = new RemoveDuplicatesInLL();

        myList.insertingnode("F");
        myList.insertingnode("G");
        myList.insertingnode("H");
        myList.insertingnode("F");
        myList.insertingnode("F");

        System.out.println("Original list:");
        myList.printLinkedList();

        myList.removeDuplicates();

        System.out.println("List after removing duplicates:");
        myList.printLinkedList();
    }
}
