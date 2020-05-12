/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode curr=head;
        ListNode root = new ListNode(0);
        ListNode temp=root;
        while(curr != null)
        {
            root.next= new ListNode(curr.val);
            curr=curr.next;
            root=root.next;
        }
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        
        while(current != null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        temp=temp.next;
        while(temp != null)
        {
            if(temp.val != previous.val)
                return false;
            temp=temp.next;
            previous=previous.next;
        }
        return true;
        
    }
}