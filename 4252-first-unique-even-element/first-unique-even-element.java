class Solution {
    public int firstUniqueEven(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            boolean found=false;
            for(int j=0;j<i;j++)
            {
                if(nums[i]==nums[j])
                {
                    found=true;
                    break;
                }
            }
            if(found==false)
            {
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[i]==nums[j])
                    {
                        count++;
                    }
                }
                if(count==1 && nums[i]%2==0)
                {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}


        
 