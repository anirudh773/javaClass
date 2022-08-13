class Stack {
    int arr[];
    int top = -1;
    int cap;

    // For creating a Stack
    public Stack(int cap) {
        this.cap = cap;
        top = -1;
        arr = new int[cap];
    }

    // For push in Stack
    public void push(int data) {
        if (top == cap - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = data;

    }

    // For traverse in Stack
    public void traverse() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        for (int i = 0; i < top + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // For pop in Stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int del = arr[top];
        top--;
        return del;
    }
    // for top element in stack
    int top() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return 0;
        } else
            return arr[top];
    }
}

public class Stack_Using_Array {
    public static void main(String[] args) {
        Stack s = new Stack(9);

        s.push(10);
        s.push(15);
        s.push(89);
        s.push(65);
        s.push(36);
        s.push(99);
        s.push(3);
        s.push(41);

        s.traverse();
        System.out.println();
     
        s.pop();
        s.traverse();
        
    }
}
