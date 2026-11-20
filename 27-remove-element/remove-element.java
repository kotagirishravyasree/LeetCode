class Solution {
    public int removeElement(int[] nums, int val) {
        int[] ans=new int[nums.length];
        Map<Integer,Integer> hm=new TreeMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int index=0;
        for(int ele:hm.keySet())
        {
            if(ele!=val)
            {
               for(int i=0;i<hm.get(ele);i++)
               {
                 ans[index++]=ele;
               }
            }
        }
        for(int i=0;i<index;i++)
        {
            nums[i]=ans[i];
        }

        return index;

        
    }
}