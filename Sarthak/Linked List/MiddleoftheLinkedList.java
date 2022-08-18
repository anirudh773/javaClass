package LinkList;

import java.util.*;

public class MiddleoftheLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list= new LinkedList<Integer>();
		list.add(2);
		list.add(5);
		list.add(8);
		list.add(4);
		System.out.println(list);
		Object[] arr=list.toArray(); // Convert LinkedList to Array
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");}
	}
// ********************************************
//	          Middle of the LinkedList
// ********************************************
	
	ListNode hare=head;
    ListNode tuttle= head;
    while((hare != null && hare.next != null)){
        hare=hare.next.next;
        tuttle=tuttle.next;
        
    }
    return tuttle;
   
    
}

