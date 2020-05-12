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
    public int findSecondMinimumValue(TreeNode root) {
        
        if(root == null){
			return -1;
		}

		Stack<TreeNode> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		stack.push(root);
        int i=0;
		while(!stack.isEmpty()){
			TreeNode temp = stack.pop();
			if(!map.containsKey(temp.val))
                map.put(temp.val,i);
                i++;
			if(temp.right != null){
				stack.push(temp.right);
			}
			if(temp.left != null){
				stack.push(temp.left);
			}
		}
        i=0;
        int arr[] = new int[map.size()];
        for (Map.Entry mapElement : map.entrySet()) { 
            arr[i] = (int)mapElement.getKey(); 
            i++;
        } 
        
        Arrays.sort(arr);
        if(arr.length < 2)
            return -1;
        else
            return arr[1];
        
    }
}