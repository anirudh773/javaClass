package LinkList;

import LinkList.Reverse_LinkList_leetcode206.Node;

// Basic of LinkList

public class LinkList {

	ListNode head;

//    LinkList(){
//        this.size = 0;
//    }

    private int size = 0;
    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //   Add the element in first
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

    //  Add the element in last
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

    // Print the list
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

    // Delete element from first
    public void deleteFirst(){
        if(head==null){
            System.out.println("The List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete element from last
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
     
    // Calculate the Size
    public int getSize(){
        return size;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkList list = new LinkList();
	        list.addFirst(4);
//	        list.printList();
	        list.addLast(5);
//	        list.printList();
	        list.addFirst(1);
//	        list.printList();
//	        list.deleteLast();
//	        list.printList();
//	        list.deleteFirst();
//	        list.printList();
	        list.addLast(5);
	        list.printList();
//	        System.out.println(list.getSize());
	        
	        list.printList();
	    }

	
	}


