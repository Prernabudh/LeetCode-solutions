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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> aList = new ArrayList<List<Integer>>();
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        if(root == null)
            return aList;
        
        q.offer(root);
        
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
        
        return aList;
    }
}