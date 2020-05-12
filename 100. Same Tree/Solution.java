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
    
    public static boolean preOrder(TreeNode p, TreeNode q){
        
        if(p == null && q == null){
			return true;
		}

		if((p != null && q == null)|| (q != null && p == null) || (p.val != q.val))
            return false;
		return(preOrder(p.left, q.left) && preOrder(p.right, q.right));
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        boolean flag = preOrder(p,q);
        return flag;
    }
}