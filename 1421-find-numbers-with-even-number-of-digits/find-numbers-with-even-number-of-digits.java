class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=fun(nums[i]);
            if(count%2==0)
            {
                even++;
            }

        }
        return even;
        
    }
    public static int fun(int n)
    {
        int count=0;
        while(n!=0)
        {
            int ld=n%10;
            count++;
            n=n/10;
        }
        return count;

    }

}