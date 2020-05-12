class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int i,pos=0,c,f=0,k,diff=0,l;
        List<Integer> list = new ArrayList<Integer>();
        for(i=0;i<gas.length;i++)
        {
            diff=gas[i]-cost[i];
            if(diff>=0)
                list.add(i);
        }
        for(k=0;k<list.size();k++)
        {
            pos=list.get(k);
            int tank=gas[pos];
            if(pos==0)
            {
               for(i=pos+1;i<gas.length;i++)
               {
                   tank = tank+gas[i]-cost[i-1];
                   if(tank<cost[i])
                   {
                       f++;
                       break;
                   }
               }
                if(f==0)
                {
                    if(tank>=cost[i-1])
                        return 0;
                }
            }
            else if(pos == gas.length-1)
            {
                l=cost[cost.length-1];
                for(i=0;i<gas.length-1;i++)
                {
                    tank=tank+gas[i]-l;
                    if(tank <cost[i])
                     {
                          f++;
                          break;
                     }
                    l=cost[i];
                }
                if(f==0 && tank>=cost[i-1])
                    return pos;
            }
            else
            {
                for(i=pos+1;i<gas.length;i++)
                {
                     tank=tank+gas[i]-cost[i-1];
                     if(tank <cost[i])
                      {
                          f++;
                          break;
                      }
                }
                if(f==0)
                {
                    c=cost[i-1];
                    for(i=0;i<pos;i++)
                    {
                        tank=tank+gas[i]-c;
                        if(tank<cost[i])
                        {
                              f++;
                              break;
                         }
                        c=cost[i];
                    }
                    if(f==0 && tank>=c)
                        return pos;   
                }
            }
            f=0;
        }
        
        return -1;
    }
}