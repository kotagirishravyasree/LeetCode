class Solution {
    public int removeDuplicates(int[] nums) {
        // Map<Integer,Integer> hm=new LinkedHashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        // }
        // int index=0;
        // for(int ele:hm.keySet())
        // {
        //     nums[index++]=ele;
        // }
        // return hm.size();

        int index=1;int count=1;
        for(int i=0;i<nums.length;i++)
            {
                int ele=nums[i];
                int j;
                for(j=i+1;j<nums.length;j++)
                    {
                        if(nums[j]!=ele)
                        {
                            nums[index]=nums[j];
                            count++;
                            index++;
                            break;
                        }
                    }
                     i=j-1;
            }
            return count;

        
    }
}