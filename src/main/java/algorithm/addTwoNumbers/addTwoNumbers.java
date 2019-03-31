package addTwoNumbers;

import java.util.HashMap;
import java.util.Map;


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }


public class addTwoNumbers {
	  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode node = new ListNode(-1);
	        ListNode cur = node;
	        int carry = 0;
	        while(l1 != null || l2 != null) {
	            int c1 = l1 == null ? 0 : l1.val;
	            int c2 = l2 == null ? 0 : l2.val;
	            int sum = c1 + c2 + carry;
	            carry = sum >= 10 ? 1 : 0;
	            cur.next = new ListNode(sum % 10);
	            cur = cur.next;
	            if(l1 != null) l1 = l1.next;
	            if(l2 != null) l2 = l2.next;
	        }
	        
	        if(carry == 1) cur.next = new ListNode(1);
	        return node.next;	        
	    }
	  	
}
