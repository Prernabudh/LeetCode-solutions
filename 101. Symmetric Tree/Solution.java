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
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null)
            return true;
        
        if(root.left == null && root.right == null)
            return true;        
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        
        if(root.left != null && root.right != null)
        {
            stack.push(root.left);
            stack2.push(root.right);
        }
        else if((root.left != null && root.right == null) || (root.right != null && root.left == null))
            return false;
        
        while(stack.isEmpty()==false || stack2.isEmpty() == false)
        {
            TreeNode temp = stack.pop();
            TreeNode temp2 = stack2.pop();
            if(temp.val != temp2.val)
                return false;
            
            if(temp.right != null && temp2.left != null)
            {
                stack.push(temp.right);
                stack2.push(temp2.left);
            }
            if((temp.right != null && temp2.left == null )||(temp.right == null && temp2.left != null))
               return false;
            if(temp.left != null && temp2.right != null)
            {
                stack.push(temp.left);
                stack2.push(temp2.right);
            }
            if((temp.left != null && temp2.right== null )||(temp.left == null && temp2.right != null))
               return false;
        }
               
    return true;
    }
}