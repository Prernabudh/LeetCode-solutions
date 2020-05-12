/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        if(m==n)
            return head;
        ListNode curr = head;
        ListNode start=null, stop=null;
        int count=1;
        ListNode temphead=null;
        while(curr != null)
        {
            if(count == m-1)
                start = curr;
            else if(count == m)
                temphead = curr;
            else if(count == n)
            {
                stop = curr.next;
                curr.next=null;
                break;
            }
            curr=curr.next;
            count++;
        }
        
        ListNode current =temphead;
        ListNode previous = null;
        ListNode next = null;
        
        while(current != null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        if(start != null)
            start.next = previous;
        else
            head=previous;
        if(stop == null)
            return head;
        while(previous.next != null)
            previous=previous.next;
        previous.next=stop;
        return head;
        
    }
}