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
    public List<List<Integer>> sum(TreeNode root, int sum, String s,List<List<Integer>> list, int r)
    {
        sum=sum+root.val;
        s=s+String.valueOf(root.val)+" ";
        
        if(root.left == null && root.right == null && sum==r)
        {
            String arr[] = s.split(" ");
            int num[] = new int[arr.length];
            for(int i=0;i<arr.length;i++)
                num[i]=Integer.parseInt(arr[i]);
            List<Integer> a1 =new ArrayList<Integer>();
            for(int i=0;i<arr.length;i++)
                a1.add(num[i]);
            list.add(a1);
            return list;
        }
        
        if(root.left !=null)
            sum(root.left, sum, s, list, r);
        if(root.right !=null)
            sum(root.right, sum, s, list, r);
        
        return list;
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null)
            return list;
        List<List<Integer>> ans = sum(root, 0, "",list,sum);
        return ans;
        
    }
}