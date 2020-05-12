/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> aList = new ArrayList<List<Integer>>();
        List<List<Integer>> aList2 = new ArrayList<List<Integer>>();
        
        if(root == null)
            return aList;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        int i;
        
        while(true)
        {
            int len = q.size();
            if(len == 0)
                break;
            List<Integer> a1 = new ArrayList<Integer>();
            while(len != 0)
            {
                TreeNode temp = q.poll();
                a1.add(temp.val);
                if(temp.left != null)
                    q.offer(temp.left);
                if(temp.right != null)
                    q.offer(temp.right);
                len--;
            }
            
            aList.add(a1);
        }
        
        for(i=aList.size()-1;i>=0;i--)
        {
            aList2.add(aList.get(i));
        }
        
        return aList2;
    }
}