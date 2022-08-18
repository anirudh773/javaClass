package LinkList;

public class Palindrome_leetcode234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		**********************************************
//		               Palindrome
//		**********************************************
		 public ListNode findmiddle(ListNode head){
		        ListNode hare=head;
		        ListNode tuttle=head;
		        while(hare.next!=null && hare.next.next!=null){
		            hare=hare.next.next;
		            tuttle=tuttle.next;
		        }
		        return tuttle;
		    }
		    public ListNode reverse(ListNode head){
		        ListNode pre=null;
		        ListNode curr=head;
		        while(curr!=null){
		            ListNode next=curr.next;
		            curr.next=pre;
		            pre=curr;
		            curr=next;
		        }
		        return pre;
		    }
		    public boolean isPalindrome(ListNode head) {
		        if(head==null || head.next==null){
		            return true;
		        }
		        ListNode middle=findmiddle(head);
		        ListNode secondstart= reverse(middle.next);
		        ListNode firststart= head;
		        while(secondstart!=null){
		            if(firststart.val!=secondstart.val){
		                return false;
		            }
		            firststart=firststart.next;
		            secondstart=secondstart.next;
		        }
		        return true;
		    }
		
	}

}
