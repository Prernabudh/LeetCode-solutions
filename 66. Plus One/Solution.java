class Solution {
    public int[] plusOne(int[] digits) {
        
        int i,carry=0;
        String s="";
        int sum = digits[digits.length-1]+1;
        if(digits.length==1)
            s=sum+s;
        else
        {
           carry = sum/10;
            sum=sum%10;
            s = sum+s; 
        }
        for(i=digits.length-2;i>=0;i--)
        {
            sum = digits[i]+carry;
            if(i==0)
                s=sum+s;
            else
            {
                carry=sum/10;
                sum=sum%10;
                s=sum+s;
            }
        }
        int arr[] = new int[s.length()];
        for(i=0;i<s.length();i++)
        {
            arr[i]=(int)(s.charAt(i)-48);
        }
        return arr;
        
    }
}