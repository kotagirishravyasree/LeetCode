class Solution {
    public int sumOfSquares(int[] nums) {
        int[] ans=new int[nums.length+1];
        for(int i=1;i<ans.length;i++)
        {
            ans[i]=nums[i-1];
        }
        int n=nums.length;
        int sum=0;
        for(int i=1;i<ans.length;i++)
        {
            if(n%i==0)
            {
                sum+=ans[i]*ans[i];
            }
        }
        return sum;
        
    }
}