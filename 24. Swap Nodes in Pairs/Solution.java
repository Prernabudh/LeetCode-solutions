/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
public ListNode swapPairs(ListNode head) {
        if(head == null)
            return head;
        if(head.next == null)
            return head;
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        
        int c=0;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode temp = head;
        // System.out.print(temp.va);
        
        while(temp != null)
        {
            c++;

            if(c%2 != 0)
            {
                ListNode data = new ListNode(temp.val);
                curr1.next = data;
                curr1 = curr1.next;
            }
            else
            {
                ListNode data = new ListNode(temp.val);
                curr2.next=data;
                curr2=curr2.next;
            }
            temp = temp.next;
        }
        
        l1 =l1.next;
        // System.out.print(l1.data);
        l2=l2.next;
        // System.out.print(l2.data);
        ListNode newlist = new ListNode(0);
        ListNode ans = newlist;
        
        while( l1 != null && l2 != null)
        {
                newlist.next = l2;
                // System.out.print(l2.data);
                newlist = newlist.next;
            l2=l2.next;
                newlist.next = l1;
                // System.out.print(l1.data);
                newlist = newlist.next;
            l1=l1.next;
        
        }
        
        return ans.next;
}
}