class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        int index=0;
        Set<Integer> set=new TreeSet<>(Comparator.reverseOrder());
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int ele:hm.keySet())
        {
            set.add(hm.get(ele));
        }
        for(int val:set)
        {
            for(int ele:hm.keySet())
            {
                if(hm.get(ele)==val && index<k)
                {
                    ans[index++]=ele;
                }
            }
            if(index>=k)
            {
                break;
            }
        }
        return ans;


        
    }
}