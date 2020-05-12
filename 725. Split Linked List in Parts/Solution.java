/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {

        ListNode curr=root;
        int len=0,i,j;
        while(curr != null)
        {
            len++;
            curr=curr.next;
        }
        int q=len/k;
        int r=len%k;
        ListNode arr[] = new ListNode[k];
        curr=root;
        for(i=0;i<k;i++)
        {
            ListNode temphead = curr;
            for(j=0;j<q+(i<r?1:0)-1;j++)
            {
                if(curr != null)
                    curr=curr.next;
            }
            
            if(curr != null)
            {
                ListNode prev = curr;
                curr=curr.next;
                prev.next = null;
            }
            
            arr[i]=temphead;
        }
        
        return arr;
    }
}