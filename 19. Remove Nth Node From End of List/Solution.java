/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int c=0,i=0;
        while(curr != null)
        {
            curr=curr.next;
            c++;
        }
        if(c==1 && n==1)
            return null;
        int index = c-n;
        if(index==0)
        {
            head=head.next;
            return head;
        }
        curr = head;
        while(curr != null)
        {
            i++;
            if(i==index)
            {
                curr.next=curr.next.next;
                break;
            }
            curr=curr.next;
        }
        return head;
    }
}