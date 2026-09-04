class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int minInst=Integer.MAX_VALUE;
        int index=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int j=0;j<=i;j++)
            {
                if(nums[j]>max)
                {
                    max=nums[j];
                }
            }
            for(int l=i;l<nums.length;l++)
            {
                if(nums[l]<min)
                {
                    min=nums[l];
                }
            }
            //System.out.println(max+" "+min);
            int inst=max-min;
            //System.out.println(inst);
            if(inst<=k && index>i)
            {
                index=i;
               // minInst=i;
            }

        }
        if(index!=Integer.MAX_VALUE){
        return index;
        }
        else
        {
            return -1;
        }
        
    }
}