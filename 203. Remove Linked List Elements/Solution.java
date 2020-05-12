/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null)
            return head;
        ListNode root = new ListNode(0);
        ListNode temp =root;
        while(head != null)
        {
            if(head.val != val)
            {
                temp.next = new ListNode(head.val);
                temp=temp.next;
            }
            head=head.next;
        }
        return root.next;
    }
}