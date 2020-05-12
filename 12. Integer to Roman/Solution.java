class Solution {
    public String intToRoman(int num) {
        String tens[]={"I","V","X","L","C","D","M"};
        int nums[]={1,5,10,50,100,500,1000};
        String s,st="";
        int l,i,chr,p,div,k,j,q,num1,f=0;
        char ch;
        s=String.valueOf(num);
        l=s.length();
        if(l==4)
            p=1000;
        else if(l==3)
            p=100;
        else if(l==2)
            p=10;
        else
            p=1;
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            chr=(int)ch-48;
            chr = chr*p;
            p=p/10;
            for(j=0;j<7;j++)
            {
                if(nums[j]==chr)
                {
                    st=st+tens[j];
                    f=1;
                }
            }
            if(f==0)
            {
                if(chr==4)
                    st=st+"IV";
                else if(chr==9)
                    st=st+"IX";
                else if(chr==40)
                    st=st+"XL";
                else if(chr==90)
                    st=st+"XC";
                else if(chr==400)
                    st=st+"CD";
                else if(chr==900)
                    st=st+"CM";
                else
                {
                    if(chr>nums[0] && chr<nums[1])
                        div=0;
                    else if(chr>nums[1] && chr< nums[2])
                        div=1;
                    else if(chr>nums[2] && chr<nums[3])
                        div=2;
                    else if(chr>nums[3] && chr<nums[4])
                        div=3;
                    else if(chr>nums[4] && chr<nums[5])
                        div=4;
                    else if(chr>nums[5] && chr<nums[6])
                        div=5;
                    else
                        div=6;
                    num1=chr;
                    while(num1>0)
                    {
                        q=num1/nums[div];
                        num1=num1%nums[div];
                        for(k=1;k<=q;k++)
                            st=st+tens[div];
                        div--;
                    }

                }
            }
            f=0;
            
        }
        return st;
        
    }
}