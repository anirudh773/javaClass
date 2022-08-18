package LinkList;


import java.util.*;

public class Reverse_LinkList_leetcode206 {

	Node head;

//  LinkList(){
//      this.size = 0;
//  }

  private int size = 0;
  class Node {
      int data;
      Node next;

      Node(int data) {
          this.data = data;
          this.next = null;
      }
  }

  //   Add the element in first
  public void addFirst(int data) {
      size++;
      Node newNode = new Node(data);
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
      Node newNode = new Node(data);
      if(head == null) {
          head = newNode;
          return;
      }
      Node currNode = head;
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
      Node currNode = head;
      while(currNode!=null){
          System.out.print(currNode.data + " -> ");
          currNode = currNode.next;
      }
      System.out.println("NULL");
  }
  
//    Reverse LinkList
  public void reverseList() {
	  if((head==null)||(head.next==null)){
		  return;
	  }
	  Node preNode=head;
	  Node currNode=head.next;
	  while(currNode!=null) {
		  Node nextNode=currNode.next;
		  currNode.next= preNode;
		  
		  preNode=currNode;
		  currNode=nextNode;
	  }
	  head.next=null;
	  head=preNode;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_LinkList_leetcode206 list = new Reverse_LinkList_leetcode206();
        list.addFirst(4);
        list.addLast(5);
        list.addFirst(1);
        list.printList();
        
//        list.reverseList();
//        list.printList();
        
        list.head=list.Reverse(list.head);
        list.printList();
	}
	
	
// **************************************************
//	             Alternate Method
// **************************************************
	
	public Node Reverse(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node newHead=Reverse(head.next);
		head.next.next=head;	
		head.next=null;
		
		return newHead;
	}

}
