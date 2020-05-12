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
    public List<String> pathrecur(TreeNode root, String s, List<String> list)
    {
        s=s+String.valueOf(root.val)+"->";
        
        if(root.left == null && root.right == null)
        {
           String st = s.substring(0,s.length()-2);
           list.add(st);
           return list;
        }
        
        if(root.left != null)
            pathrecur(root.left, s, list);
        if(root.right != null)
            pathrecur(root.right, s, list);
        
        return list;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> list = new ArrayList<String>();
        if(root == null)
            return list;
        String s="";
        List<String> ans = pathrecur(root,s,list);
        
        return ans;
        
        
        
    }
}