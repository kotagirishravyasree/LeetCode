class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> hm=new HashMap<>();
        boolean found=false;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(int ele:hm.keySet())
        {
            if(hm.get(ele)>=2)
            {
                found=true;
            }
        }
        return found;

    }
}