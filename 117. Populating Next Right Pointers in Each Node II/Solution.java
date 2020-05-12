/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        
        if(root == null)
            return root;
        
        Queue<Node> q= new LinkedList<Node>();
        q.offer(root);
        
        while(true)
        {
            int len=q.size();
            if(len == 0)
                break;
            
            while(len != 0)
            {
                Node temp = q.poll();
                if(len != 1)
                    temp.next = q.peek();
                else
                    temp.next= null;
                if(temp.left != null)
                    q.offer(temp.left);
                if(temp.right != null)
                    q.offer(temp.right);
                
                len--;
            }
        }
        
        return root;
        
        
    }
}