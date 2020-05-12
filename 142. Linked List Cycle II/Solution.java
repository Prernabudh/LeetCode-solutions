/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null)
            return null;
        
        ListNode temp=head;
        int i=0;
        Map<ListNode, Integer> map = new HashMap<ListNode, Integer>();
        while(temp != null)
        {
            if(map.containsKey(temp))
                return(temp);
            else
                map.put(temp,i);
            temp=temp.next;
            i++;
        }
        return null;
        
    }
}