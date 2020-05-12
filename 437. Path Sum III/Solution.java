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
    int c=0;
    List<Integer> list = new ArrayList<Integer>();
    public int pathSum(TreeNode root, int sum) {
        
        if(root == null)
            return c;
        list.add(root.val);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        
        int k=0;
        for(int i=list.size()-1;i>=0;i--)
        {
            k=k+list.get(i);
            if(k==sum)
                c++;
        }
        list.remove(list.size()-1);
        
        return c;
    }
}