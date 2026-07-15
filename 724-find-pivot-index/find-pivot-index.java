class Solution {
    public int pivotIndex(int[] nums) {
        int[] pre=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<pre.length;i++)
        {
            pre[i]=pre[i-1]+nums[i];
        }
        int leftsum=0;
        int rightsum=0;
        for(int j=0;j<pre.length;j++)
        {
           if(j==0)
           {
              leftsum=0;
           }
           else
           {
              leftsum=pre[j-1];
           }
           if(j==pre.length-1)
           {
              rightsum=0;
           }
           else
           {
              rightsum=pre[pre.length-1]-pre[j];
           }
           if(leftsum==rightsum)
           {
              return j;
           }
        }
        return -1;    
    }
}