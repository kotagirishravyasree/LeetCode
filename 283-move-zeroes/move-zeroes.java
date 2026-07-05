class Solution {
    public void moveZeroes(int[] nums) {
        int zeros=0;
        int count=0;
        int index=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zeros++;
            }
        }
        for(int i=0;count<zeros;i++)
        {
            if(nums[i]==0)
            {
                index=i;
                i=index-1;
                int temp=nums[index];
            for(int j=index;j<nums.length-1;j++)
            {
                nums[j]=nums[j+1];
            }
            nums[nums.length-1]=temp;
            count++;
            }
        }
        
    }
}
        
