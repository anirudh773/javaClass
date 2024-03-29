import static java.lang.System.exit;
  
class StackUsingLinkedlist {
  
    private class Node {
  
        int data;
        Node link;
    }
 
    Node top;
    // Constructor
    StackUsingLinkedlist()
    {
        this.top = null;
    }
    public void push(int x)
    {
        Node temp = new Node();
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
        temp.data = x;
        temp.link = top;
        top = temp;
    }
  
    public boolean isEmpty()
    {
        return top == null;
    }
  
    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
  
    public int pop()
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return 0;
        }
        int x = top.data;
        top = (top).link;
        return x;
    }
  
    public void display()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.printf("%d->", temp.data);
                temp = temp.link;
            }
        }
    }
}
public class Stack1 {
    public static void main(String[] args)
    {
        StackUsingLinkedlist obj = new StackUsingLinkedlist();
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);
  
        obj.display();
  
        System.out.printf("\nTop element is %d\n", obj.peek());
  
        obj.pop();
        obj.pop();
  
        obj.display();
        System.out.printf("\nTop element is %d\n", obj.peek());
    }
}
