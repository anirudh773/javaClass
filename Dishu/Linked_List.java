
// Contruct Class Node for creating Node in Linked_list.
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Linked_List {

    // Fuction for Traversing in Linked_list.
    public static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    // Fuction for inserting a Node in Linked_list.
    public static void insert(int data, Node head, int pos) {
        Node add = new Node(data);
        if (pos == 0) {
            add.next = head;
            head = add.next = head;
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        add.next = temp.next;
        temp.next = add;
    }

    // Fuction for deleting a Node in Linked_list.
    public static void delete(Node head, int pos) {
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        traverse(head);
        System.out.println();

        insert(35, head, 3);
        traverse(head);
        System.out.println("  (Linked list after inserting an element at position 3 )");

        delete(head, 3);
        traverse(head);
        System.out.println("  (Linked list after deleting an element from position 3 )");
    }
}