/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null)
            return null;
        ListNode curr = head;
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        while(curr != null)
        {
            map.put(curr.val, map.getOrDefault(curr.val,0)+1);
            curr=curr.next;
        }
        ListNode temp = new ListNode(0);
        ListNode data = temp;
        for (Map.Entry mapElement : map.entrySet()) { 
            int key = (int)mapElement.getKey(); 
            int value = (int)mapElement.getValue(); 
            if(value == 1)
            {
                temp.next = new ListNode(key);
                temp=temp.next;
            }
        }
        
        return data.next;
    }
}