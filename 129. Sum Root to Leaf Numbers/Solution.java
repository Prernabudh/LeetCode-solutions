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
    
    public static int sumup(TreeNode root, int val)
    {
        if(root == null)
            return 0;
        
        val = val * 10 + root.val;
        
        if(root.left == null && root.right == null)
            return val;
        return sumup(root.left, val)+sumup(root.right, val);
    }
    public int sumNumbers(TreeNode root) {
        
        int sum = sumup(root,0);
        return sum;
        
    }
}