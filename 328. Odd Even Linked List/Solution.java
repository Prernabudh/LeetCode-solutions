/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null)
            return null;
        
        ListNode evenlist = head.next;
        ListNode headnew = evenlist;
        ListNode oddlist = head;
        while(evenlist != null && evenlist.next != null)
        {
            oddlist.next=evenlist.next;
            oddlist=oddlist.next;
            evenlist.next=oddlist.next;
            evenlist=evenlist.next;
        }
        
        oddlist.next=headnew;
        return head;
        
    }
}