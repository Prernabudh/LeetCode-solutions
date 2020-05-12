class Solution {
    public List<Integer> getRow(int numRows) {
        
        int i,j,sum;
        List<Integer> a1 = new ArrayList<Integer>();
        List<Integer> a3= new ArrayList<Integer>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        a1.add(1);
        if(numRows == 0)
            return a1;
        list.add(a1);
        a3.add(1);
        a3.add(1);
        if(numRows == 1)
            return a3;
        list.add(a3);
        for(i=2;i<=numRows;i++)
        {
            List<Integer> a2= new ArrayList<Integer>();
            a2.add(1);
            for(j=0;j<i-1;j++)
            {
                sum=list.get(i-1).get(j)+list.get(i-1).get(j+1);
                a2.add(sum);
            }
            a2.add(1);
            if(i==numRows)
                return a2;
            list.add(a2);
        }
        return a3;
        
    }
}