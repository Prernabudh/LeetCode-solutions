class Solution {
    public String reverseWords(String s) {
        
        String arr[] = s.split(" ");
        String rev="";
        int i;
        // for(i=0;i<arr.length;i++)
        //     System.out.print(arr[i]+",");
        for(i=arr.length-1;i>=0;i--)
        {
            if(!arr[i].equals(""))
                rev=rev+arr[i]+" ";
        }
        String st = rev.trim();
        return st;
    }
}