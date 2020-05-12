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
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null)
            return root;
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode temp2 = null;
        
        while(!stack.isEmpty())
        {
            TreeNode temp = stack.pop();
            if(temp.left != null && temp.right != null)
            {
                temp2 = temp.left;
                temp.left = temp.right;
                temp.right = temp2;
            }
            else if(temp.left != null && temp.right == null)
            {
                temp.right = temp.left;
                temp.left = null;
            }
            else if(temp.right != null && temp.left == null)
            {
                temp.left = temp.right;
                temp.right = null;
            }
            
            if(temp.right != null)
                stack.push(temp.right);
            if(temp.left != null)
                stack.push(temp.left);
        }
       return root; 
    }
}