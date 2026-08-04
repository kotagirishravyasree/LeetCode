class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<=nums.length;i++)
        {
            boolean present=false;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==i)
                {
                    present=true;
                    break;
                }
            }
            if(present==false)
            {
                ans=i;
                break;
            }
        }
        return ans;

        
    }
}