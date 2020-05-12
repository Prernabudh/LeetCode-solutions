/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        
        ListNode sorted = null;
        ListNode curr = head;
        
        while(curr != null)
        {
            ListNode next = curr.next;
            
            if(sorted == null || sorted.val>=curr.val)
            {
                curr.next = sorted;
                sorted = curr;
            }
            else
            {
                ListNode node = sorted;
                while(node.next != null && node.next.val<curr.val)
                    node = node.next;
                curr.next = node.next;
                node.next = curr;
            }
            
            curr = next;
        }
      return sorted;  
    }
}