/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        if(node.next == null)
        {
            node=null;
            return;
        } 
        
        if(node.next.next==null)
        {
            node.val = node.next.val;
            node.next = null;
            return;
        }
        
        ListNode next = node.next.next;
        node.val = node.next.val;
        node.next = next;
        
    }
}