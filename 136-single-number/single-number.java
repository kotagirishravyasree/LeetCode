class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> hm= new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        for(int ele:hm.keySet())
        {
            if(hm.get(ele)==1)
            {
                ans=ele;
            }
        }
        return ans;
        
    }
}