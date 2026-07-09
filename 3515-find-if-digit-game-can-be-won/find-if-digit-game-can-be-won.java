class Solution {
    public boolean canAliceWin(int[] nums) {
        int count=0;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++)
        {
            count=digit(nums[i]);
            if(count!=2)
            {
                sum1+=nums[i];
            }
            else
            {
                sum2+=nums[i];
            }
        }
        if(sum1==sum2)
        {
            return false;
        }
        else
        {
            return true;
        }

        
        
    }
    public static int digit(int n)
    {
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
}