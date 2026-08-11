class Solution {
    public int missingInteger(int[] nums) {
        int num=0;
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
        int j=0,k=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[k]==nums[j]+1)
            {
                k++;
                j++;
            }
            else
            {
                break;
            }
           
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int l=0;l<nums.length;l++)
            {
                if(prefix[j]==nums[l])
                {
                    prefix[j]++;
                    break;
                }
            }
        }
        return prefix[j];

        
    }
}