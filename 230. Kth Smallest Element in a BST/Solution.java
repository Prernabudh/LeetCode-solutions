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
    public int kthSmallest(TreeNode root, int k) {
        
        if(root == null){
			return 0;
		}
        
        Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while(!stack.isEmpty() || temp != null)
		{
			if(temp != null)
			{
				stack.push(temp);
				temp = temp.left;
			}
			else
			{
				temp = stack.pop();
				k--;
                if(k==0)
                    return temp.val;
				temp = temp.right;
			}
		}
        
        return temp.val;
    }
}