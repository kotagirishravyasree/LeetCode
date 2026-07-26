class Solution {
    public int majorityElement(int[] nums) {
        // HashMap <Integer,Integer> hm=new HashMap<>();
        // int majority=-1;
        // int half=nums.length/2;
        // for(int i=0;i<nums.length;i++)
        // {
        //     int n=nums[i];
        //     hm.put(n,hm.getOrDefault(n,0)+1);
        // }
        // for(int ele:hm.keySet())
        // {
        //     if(hm.get(ele)>half)
        //     {
        //        return ele;
        //     }
        // }
        // return majority;


        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}