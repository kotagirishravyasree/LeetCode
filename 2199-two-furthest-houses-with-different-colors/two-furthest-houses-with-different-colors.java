class Solution {
    public int maxDistance(int[] colors) {
        int max1=0;
        int max2=0;
        int index1=colors.length-1;
        int index2=0;
        // for(int i=0;i<colors.length;i++)
        // {
        //     for(int j=i+1;j<colors.length;j++)
        //     {
        //         if(colors[i]!=colors[j])
        //         {
        //             int temp=Math.abs(i-j);
        //             max=Math.max(temp,max);
        //         }
        //     }
        // }
        // return max;
        for(int i=colors.length-2;i>=0;i--)
        {
            if(colors[index1]!=colors[i])
            {
                int diff=Math.abs(i-index1);
                max1=Math.max(diff,max1);
                

            }
        }
        for(int i=1;i<colors.length;i++)
        {
            if(colors[index2]!=colors[i])
            {
                int diff=Math.abs(i-index2);
                max2=Math.max(diff,max2);
                

            }
        }
        return Math.max(max1,max2);
        
    }
}