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
    
    public static int levelorder(TreeNode newroot){
		if(newroot == null){
			return 0;
		}
		int c=0;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(newroot);

		while(true)
		{
			int len = q.size();
			if(len == 0)
				break;

			while(len != 0)
			{
				TreeNode newtemp = q.poll();
				if(newtemp.left != null)
					q.offer(newtemp.left);
				if(newtemp.right != null)
					q.offer(newtemp.right);
				len--;
			}

			c++;
		}
        
        return c;
	}
    public boolean isBalanced(TreeNode root) {
        
        if(root == null){
			return true;
		}
        int l=0,r=0;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while(!stack.isEmpty()){
			TreeNode temp = stack.pop();
            if(temp.left != null)
			    l = levelorder(temp.left);
            if(temp.right != null)
                r=levelorder(temp.right);
            if(Math.abs(l-r)> 1)
                return false;
            l=0;
            r=0;
			if(temp.right != null){
				stack.push(temp.right);
			}
			if(temp.left != null){
				stack.push(temp.left);
			}
		}
        
        return true;
        
    }
}