class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        // int index=0;
        // for(int i=0;i<ans.length;i++)
        // {
        //      if(index==nums.length)
        //      {
        //          index=0;
        //      }
        //      ans[i]=nums[index];
        //      index++;
        // }
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}