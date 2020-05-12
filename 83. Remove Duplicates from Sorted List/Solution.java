/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode curr = head;
        while(curr != null)
        {
            ListNode temp=curr;
            while(curr.next != null && curr.val == curr.next.val)
                curr=curr.next;
            if(curr.next == null)
            {
                temp.next=null;
                break;
            }
            curr=curr.next;
            temp.next=curr;
        }
       return head; 
    }
}