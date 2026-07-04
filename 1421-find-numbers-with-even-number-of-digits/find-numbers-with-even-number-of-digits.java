class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=digits(nums[i]);
            if(count%2==0)
            {
                even++;
            }

        }
        return even;
        
    }
    public static int digits(int n)
    {
        if(n<0){
            n=n*-1;
        }
        if(n==0)
        {
            return 1;
        }
        int count=0;
        while(n!=0)
        {
            int ld=n%10; //you don't need this line.
            count++; 
            n=n/10;
        }
        return count;

    }

}