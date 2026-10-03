class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum= 0;
        int ans=nums[0];
        for(int ele:nums)
        {
            currentSum=Math.max(ele,currentSum+ele);
            ans=Math.max(ans,currentSum);
        }
        return ans;
        
    }
}