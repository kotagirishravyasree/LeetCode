class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        int count=0;
        int prefixSum=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            prefixSum+=nums[i];
            int diff=prefixSum-k;
            if(hm.containsKey(diff))
            {
                count+=hm.get(diff);
            }
            hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);
        }
                 
        return count;
        
    }
}