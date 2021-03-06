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
    public int minDepth(TreeNode root) {
        
        if(root == null)
            return 0;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        
        int c=0;
        while(true)
        {
            int len = q.size();
            if(len == 0)
                break;
            
            while(len != 0)
            {
                TreeNode temp = q.poll();
                if(temp.left == null && temp.right == null)
                    return c+1;
                if(temp.left != null)
                    q.offer(temp.left);
                if(temp.right != null)
                    q.offer(temp.right);
                len--;
            }
            
            c++;
        }
        
        return c+1;
        
    }
}