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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        Map<TreeNode, TreeNode> map = new HashMap<TreeNode, TreeNode>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        map.put(root,null);
        while(!map.containsKey(p) || !map.containsKey(q))
        {
            TreeNode node = stack.pop();
            
            if(node.left != null)
            {
                map.put(node.left,node);
                stack.add(node.left);
            }
            if(node.right != null)
            {
                map.put(node.right,node);
                stack.add(node.right);
            }
        }
        Set<TreeNode> set = new HashSet<TreeNode>();
        while(p!=null)
        {
            set.add(p);
            p=map.get(p);
        }
        while(!set.contains(q))
            q=map.get(q);
        return q;
    }
}