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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> list = new ArrayList<Integer>();
        if(root == null)
            return list;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        
        while(true)
        {
            int len = q.size();
            if(len == 0)
                break;
            while(len != 0)
            {
                TreeNode temp = q.poll();
                if(len == 1)
                    list.add(temp.val);
                if(temp.left != null)
                    q.offer(temp.left);
                if(temp.right != null)
                    q.offer(temp.right);
                
                len--;
            }
        }
        
        return list;
        
        
    }
}