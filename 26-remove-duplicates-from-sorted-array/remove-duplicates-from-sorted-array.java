class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0,k=1;
        while(j<nums.length)
        {
            if(nums[i]==nums[j])
            {
                j++;
            }
            else
            {
                int n=nums[j];
                nums[k]=n;
                k++;
                i=j;
            }
        }
        return k; 
    }
}