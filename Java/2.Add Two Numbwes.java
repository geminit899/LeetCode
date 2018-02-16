/**
 * @author Geminit
 * @create 2018-2-16
 * @lastUpdate 2018-2-16
 */

/**
 *	Description:
 *		You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and 
 *   	each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 *		You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);  
		ListNode p=l1,q=l2,curr=dummyHead;  
		int carry=0;//进位  
		while(p!=null || q!=null){  
			int x=(p!=null)?p.val:0;  
			int y=(q!=null)?q.val:0;  
			int sum=x+y+carry;  
			carry=sum/10;  
			curr.next=new ListNode(sum%10);  
			curr=curr.next;  
			if(p!=null) p=p.next;  
			if(q!=null) q=q.next;  
		}  
		if(carry>0){  
			curr.next=new ListNode(carry);  
		}  
		  
		return dummyHead.next;  
		
	}
}
