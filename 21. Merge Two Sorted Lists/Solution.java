/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sortlist = new ListNode(0);
        ListNode ans = sortlist;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        while(curr1!= null || curr2!= null)
        {
            if(curr1 == null)
            {
               sortlist.next = curr2;
               curr2 = curr2.next;
            } 
            else if(curr2 == null)
            {
                sortlist.next = curr1;
                curr1 = curr1.next;
            }
            else if(curr1.val <= curr2.val)
            {
                sortlist.next = curr1;
                curr1 = curr1.next;
            }
            else
            {
                sortlist.next = curr2;
                curr2 = curr2.next;
            } 
            
            sortlist = sortlist.next;
            
        }
        
        return ans.next;
    }
}