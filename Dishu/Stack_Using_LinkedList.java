class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
class Stack {
    Node head;
    int size;

    public Stack() {
        head = null;
        size = 0;
    }

    void push(int data) {
        Node temp = new Node(data);
        temp.next = head;
        size++;
        head = temp;

    }

    public int peak() {
        if (head == null) {
            System.out.println("Empty");
            return 0;
        }
        return head.data;
    }

    public int pop() {
        if (head == null) {
            System.out.println("Empty");
            return 0;
        }
        int del = head.data;
        head = head.next;
        size--;
        return del;
    }
}

public class Stack_Using_LinkedList {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(12);
        s.push(98);
        s.push(65);
        s.push(43);
        s.push(4);
        s.push(86);
        s.push(21);
        s.push(456);
       
        System.out.println("The top element is: "+s.peak());
        s.pop();
        System.out.println("The top element is: "+s.peak());
    }
}
