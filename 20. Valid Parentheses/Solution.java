class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i,f=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                stack.push(s.charAt(i));
            if(s.charAt(i)==')')
            {
                if(stack.isEmpty()==true)
                    return false;
                if(stack.peek()=='(')
                    stack.pop();
                else
                {
                    f++;
                    break;
                }
            }
            if(s.charAt(i)==']')
            {
                if(stack.isEmpty()==true)
                    return false;
                if(stack.peek()=='[')
                    stack.pop();
                else
                {
                    f++;
                    break;
                }
            }
            if(s.charAt(i)=='}')
            {
                if(stack.isEmpty()==true)
                    return false;
                if(stack.peek()=='{')
                    stack.pop();
                else
                {
                    f++;
                    break;
                }
            }
        }
        if(f>0)
            return false;
        else if(f==0 && stack.isEmpty()==true)
            return true;
        else
            return false;
    }
}