/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode temp = head;
        int count=0;
        while(temp != null)
        {
            temp=temp.next;
            count++;
        }
        int pos=count/2;
        temp=head;
        int c=0;
        while(temp != null)
        {
            if(c==pos)
                return temp;
            temp=temp.next;
            c++;
        }
       return temp; 
    }
}