class Solution {
    public String multiply(String num1, String num2) {
        
        if(num1.equals("0")||num2.equals("0"))
            return "0";
        int i,carry=0,prod,k=0,j,sum=0;
        String s="";
        List<String> list = new ArrayList<String>();
        List<String> a = new ArrayList<>();
        for(i=num2.length()-1;i>=0;i--)
        {
            for(j=num1.length()-1;j>=0;j--)
            {
                prod=(int)(num1.charAt(j)-48)*(int)(num2.charAt(i)-48)+carry;
                carry=prod/10;
                if(j==0)
                    s=String.valueOf(prod)+s;
                else
                    s=String.valueOf(prod%10)+s;
            }
            for(j=0;j<k;j++)
                s=s+"0";
            k++;
            list.add(s);
            s="";
            carry=0;
        }
        int len=list.get(list.size()-1).length();
        for(i=0;i<list.size();i++)
        {
            int l=list.get(i).length();
            s=list.get(i);
            for(j=0;j<len-l;j++)
                s="0"+s;
            a.add(s);
        }
        carry=0;sum=0;
        s="";
        for(i=len-1;i>=0;i--)
        {
            for(j=0;j<a.size();j++)
            {
                sum=sum+(int)(a.get(j).charAt(i)-48);
            }
            sum=sum+carry;
            carry=sum/10;
            if(i==0)
                s=String.valueOf(sum)+s;
            else
                 s=String.valueOf(sum%10)+s;
            sum=0;
        }
        return s;
    }
}