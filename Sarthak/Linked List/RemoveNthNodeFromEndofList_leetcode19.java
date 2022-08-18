package LinkList;

import LinkList.Reverse_LinkList_leetcode206.Node;

public class RemoveNthNodeFromEndofList_leetcode19 {

	
		public static void main(String [] args) {
			
			
		}
//		*********************************************
//		              Leetcode Function
//		*********************************************
		 public ListNode removeNthFromEnd(ListNode head, int n) {
		        if(head.next==null){
		            return null;
		        }
		        int size=0;
		        ListNode currNode=head;
		        while(currNode != null){
		            currNode= currNode.next;
		            size++;
		        }
		        if(n==size){
		            return head.next;
		        }
		        int indexTosearch=size-n;
		        ListNode pre=head;
		        int i=1;
		        while(i<indexTosearch){
		            pre=pre.next;
		            i++;
		        }
		        pre.next=pre.next.next;
		        return head;
		    }

}
