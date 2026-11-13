class Solution {
    public int alternatingSubarray(int[] nums) {
        int max=-1;
        for(int l=0;l<nums.length;l++)
        {
            for(int j=l;j<nums.length;j++)
            {
                List<Integer> list=new ArrayList<>();
                boolean rule=true;
                for(int k=l;k<=j;k++)
                {
                    list.add(nums[k]);
                }
                if(list.size()>1){
                for(int i=0;i<list.size();i++)
                {
                    if(i%2==0)
                    {
                        if(i+1<list.size())
                        {
                            if(list.get(i+1)-list.get(i)!=1)
                            {
                                rule=false;
                                break;
                            }
                        }
                    }
                    else
                    {
                        if(i+1<list.size())
                        {
                            if(list.get(i+1)-list.get(i)!=-1)
                            {
                                rule=false;
                                break;
                            }
                        }
                    }
                }
                }
                if(rule && list.size()>1)
                {
                    if(list.size()>max)
                    {
                        max=list.size();
                    }
                }

            }
        }
        return max;
        
    }
}