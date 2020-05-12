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
    
    public void flatten(TreeNode root) {
        
        if(root == null)
            return;
        TreeNode rightside = null;
        TreeNode newroot = null; 
        TreeNode leftside = null;
        TreeNode newroot2 = null; 
        Stack<TreeNode> stack = new Stack<>();
        if(root.right != null)
        {
            stack.push(root.right);
        
            rightside = new TreeNode(root.right.val);
            newroot = rightside;  

            while(!stack.isEmpty())
            {
                TreeNode temp = stack.pop();
                newroot.right = new TreeNode(temp.val);
                newroot = newroot.right;
                if(temp.right != null)
                    stack.push(temp.right);
                if(temp.left != null)
                    stack.push(temp.left);
            }
        }
        
        
        stack.clear();
        
        if(root.left != null)
        {
            stack.push(root.left);
        
            leftside = new TreeNode(root.left.val);
            newroot2 = leftside;   

            while(!stack.isEmpty())
            {
                TreeNode temp = stack.pop();
                newroot2.right = new TreeNode(temp.val);
                newroot2 = newroot2.right;
                if(temp.right != null)
                    stack.push(temp.right);
                if(temp.left != null)
                    stack.push(temp.left);
            }
            
            TreeNode next = leftside;
            while(next.right != null)
                next=next.right;

            if(rightside != null)
                next.right=rightside.right;  

            root.left = null;
        }
        
        if(leftside != null)
            root.right = leftside.right;
        
        else if(leftside == null && rightside != null)
            root.right = rightside.right;
        
        
        
    }
}