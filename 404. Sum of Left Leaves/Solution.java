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
    public int sumOfLeftLeaves(TreeNode root) {
        
        if(root == null){
			return 0;
		}

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
        int sum=0;
		while(!q.isEmpty())
		{
			TreeNode temp = q.poll();
            if(temp.left != null)
            {
                TreeNode leftnode = temp.left;
                if(leftnode.left == null && leftnode.right == null)
                    sum=sum+leftnode.val;
            }
			if(temp.left != null)
				q.offer(temp.left);
			if(temp.right != null)
				q.offer(temp.right);
		}
        
        return sum;
    }
}