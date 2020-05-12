/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        
        ListNode curr = head;
        List<Integer> list = new ArrayList<Integer>();
        while(curr != null)
        {
            list.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(list);
        ListNode root = new ListNode(0);
        ListNode temp=root;
        for(int i=0;i<list.size();i++)
        {
            root.next = new ListNode(list.get(i));
            root=root.next;
        }
        return temp.next;
    }
}