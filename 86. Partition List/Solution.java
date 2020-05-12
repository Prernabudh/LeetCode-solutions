/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        
        if(head == null)
            return null;
        ListNode temp1 = new ListNode(0);
        ListNode temp2 = new ListNode(0);
        ListNode curr1=temp1;
        ListNode curr2=temp2;
        
        ListNode curr = head;
        while(curr != null)
        {
            if(curr.val<x)
            {
                temp1.next = new ListNode(curr.val);
                temp1=temp1.next;
            }
            else
            {
                temp2.next = new ListNode(curr.val);
                temp2=temp2.next;
            }
            
            curr=curr.next;
        }
        
       temp1.next = curr2.next;
       return curr1.next;
        
    }
}