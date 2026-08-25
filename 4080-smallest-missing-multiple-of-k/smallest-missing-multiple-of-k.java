class Solution {
    public int missingMultiple(int[] nums, int k) {
     HashMap<Integer,Integer> hm=new HashMap<> ();
     for(int i=0;i<nums.length;i++)
     {
        int n=nums[i];
        hm.put(n,hm.getOrDefault(n,0)+1);
     }
     int n=1,mul=k;
     while(hm.containsKey(mul))
     {
        n++;
        mul=k*n;
     }
     return mul;

    }
}