class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        int[] freq=new int[max+1];
        for(int val:nums)
        {
            freq[val]++;
        }
        Arrays.sort(freq);
        int freqMax=freq[max];
        int sum=0;
        for(int ele:freq)
        {
            if(ele==freqMax)
            {
                sum+=ele;
            }
        }
        return sum;
        
        
    }
}