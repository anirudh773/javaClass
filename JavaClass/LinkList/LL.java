class LL {

    ListNode head;

    LL(){
        this.size = 0;
    }

    private int size = 0;
    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        size++;
        ListNode newNode = new ListNode(data);
        if (head == null){
            head = newNode;
            return; 
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        size ++;
        ListNode newNode = new ListNode(data);
        if(head == null) {
            head = newNode;
            return;
        }
        ListNode currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        ListNode currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("The List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null ){
            System.out.println("The List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        ListNode secLast = head;
        ListNode lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secLast = secLast.next;
        }
        secLast.next = null;
    }
     
    public int getSize(){
        return size;
    }
     

    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst(4);
        list.printList();
        list.addLast(5);
        list.printList();
        list.addFirst(1);
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteFirst();
        list.printList();
        list.addLast(5);
        System.out.println(list.getSize());
    }
}