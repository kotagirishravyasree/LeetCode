class Solution {
    public int numIdenticalPairs(int[] nums) {
        // int count=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;
        HashMap <Integer,Integer> hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            if(hm.containsKey(n))
            {
                int prev=hm.get(n);
                ans=ans+prev;
                hm.put(n,prev+1);
            }
            else
            {
                hm.put(n,1);
            }
        }
        return ans;
    }
}