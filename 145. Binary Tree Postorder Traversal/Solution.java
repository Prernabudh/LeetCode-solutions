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
    
    public static List<Integer> postorder(TreeNode root, List<Integer> a1)
    {
        if(root == null)
            return a1;
        
        postorder(root.left, a1);
        postorder(root.right, a1);
        a1.add(root.val);
        
        return a1;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<Integer>();
        list = postorder(root, list);
        
        return list;
        
    }
}