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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> a1 = new ArrayList<Integer>();
        
        if(root == null){
			return a1;
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
				a1.add(temp.val);
				temp = temp.right;
			}
		}
        return a1;
    }
}