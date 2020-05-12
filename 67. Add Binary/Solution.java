class Solution {
    
    public static String add(char ch1, char ch2)
        {
            if((ch1 == '1'&& ch2=='0')||(ch1 == '0' && ch2=='1'))
                return "1";
            else if(ch1 == '1'&& ch2 == '1')
                return "10";
            else
                return "0";
        }
    public String addBinary(String a, String b) {
        
        String val,s="";
        char sum,carry='0',cha,chb;
        int i;
        int max= Math.max(a.length(),b.length());
        for(i=a.length();i<max;i++)
            a="0"+a;
        for(i=b.length();i<max;i++)
            b="0"+b;
        
        for(i=a.length()-1;i>=0;i--)
        {
            cha=a.charAt(i);
            chb=b.charAt(i);
            val = add(cha,chb);
            if(val.equals("10") && carry=='1')
                val="11";
            else if(val.equals("10") && carry=='0')
                val="10";
            else if(val.equals("1")&& carry=='1')
                val="10";
            else if((val.equals("1")&& carry=='0') || (val.equals("0")&& carry=='1'))
                val="1";
            else
                val="0";
            if(val.length()>1)
            {
               carry=val.charAt(0);
               sum=val.charAt(1); 
            }
            else
            {
                carry='0';
                sum=val.charAt(0);
            }
            if(i==0)
                s=val+s;
            else
                s=String.valueOf(sum)+s;
                
        }
        return s;
    }
}