class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++)
        {
           for(int j=i;j<nums.size();j++)
           {
              List<Integer> list=new ArrayList<>();
              int sum=0;
              for(int k=i;k<=j;k++)
              {
                 list.add(nums.get(k));
                 sum+=nums.get(k);
              }
              if(list.size()>=l && list.size()<=r)
              {
                if(sum>0 && sum<min)
                {
                    min=sum;
                }
              }
           }
        }
        if(min!=Integer.MAX_VALUE)
        {
            return min;
        }
        return -1;
    }
}