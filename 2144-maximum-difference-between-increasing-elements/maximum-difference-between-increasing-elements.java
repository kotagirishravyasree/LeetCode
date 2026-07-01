class Solution {
    public int maximumDifference(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]<nums[j])
                {
                    int diff=nums[j]-nums[i];
                    if(max<diff)
                    {
                        max=diff;
                    }
                }
                
            }
           

        }
        if(max!=0)
        {
            return max;
        }
        else
        {
            return -1;
        }
        
    }
}