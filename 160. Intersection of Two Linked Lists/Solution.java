/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode list1 = headA;
        ListNode list2=headB;
        int i=0;
        Map<ListNode, Integer> map = new HashMap<ListNode, Integer>();
        while(list1 != null)
        {
            map.put(list1,i);
            list1=list1.next;
        }
        while(list2 != null)
        {
            if(map.containsKey(list2))
                return list2;
            list2=list2.next;
        }
        return null;
    }
}