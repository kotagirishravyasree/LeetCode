class Solution {
    public List<Integer> findLonely(int[] nums) {
        // List<Integer> numsList=new ArrayList<>();
        List<Integer> ansList=new ArrayList<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     numsList.add(nums[i]);
        // }
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(hm.get(nums[i])==1)
        //     {
        //         if(!numsList.contains(nums[i]+1) && !numsList.contains(nums[i]-1))
        //         {
        //             ansList.add(nums[i]);
        //         }
        //     }
        // }
        for(int i=0;i<nums.length;i++)
        {
            if(hm.get(nums[i])==1)
            {
                if(!hm.containsKey(nums[i]-1) && !hm.containsKey(nums[i]+1))
                {
                    ansList.add(nums[i]);
                }
            }
        }
        return ansList;
        
    }
}