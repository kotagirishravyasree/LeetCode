class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int p1=nums[0]*nums[1];
        if(nums[2]<=0)
        {
            p1=p1*nums[nums.length-1];
        }
        else
        {
            p1=p1*nums[2];
        }
        int p2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        return Math.max(p1,p2);
    }
}