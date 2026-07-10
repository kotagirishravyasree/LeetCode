class Solution {
    public int maximumDifference(int[] nums) {
        int max_diff=0;
         int diff=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]-nums[i]>diff)
                {
                    diff=nums[j]-nums[i];
                }
            }
            if(max_diff<diff)
            {
                max_diff=diff;
            }
        }
        if(max_diff==0)
        {
            return -1;
        }
        else
        {
            return max_diff;
        }
        
    }
}