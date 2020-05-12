class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        int i,j,sum;
        List<Integer> a1 = new ArrayList<Integer>();
        List<Integer> a3= new ArrayList<Integer>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(numRows == 0)
            return list;
        a1.add(1);
        list.add(a1);
        if(numRows == 1)
            return list;
        a3.add(1);
        a3.add(1);
        list.add(a3);
        for(i=3;i<=numRows;i++)
        {
            List<Integer> a2= new ArrayList<Integer>();
            a2.add(1);
            for(j=0;j<i-2;j++)
            {
                sum=list.get(i-2).get(j)+list.get(i-2).get(j+1);
                a2.add(sum);
            }
            a2.add(1);
            list.add(a2);
        }
        return list;
    }
}