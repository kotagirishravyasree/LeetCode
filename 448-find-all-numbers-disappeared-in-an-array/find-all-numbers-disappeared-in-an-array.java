class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       HashMap<Integer,Integer> hm=new HashMap<>();
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
       }
       for(int i=1;i<=nums.length;i++)
       {
         if(!hm.containsKey(i))
         {
            list.add(i);
         }
       }
       return list;
    }
}