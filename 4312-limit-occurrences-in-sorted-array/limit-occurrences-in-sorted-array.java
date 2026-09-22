class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        Map<Integer,Integer> mp=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int ele:mp.keySet()){
            if(mp.get(ele)>=k)
            {
                for(int j=1;j<=k;j++)
                {
                    list.add(ele);
                }
            }
            else{
               for(int j=1;j<=mp.get(ele);j++)
                {
                    list.add(ele);
                }
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            result[i]=list.get(i);
        }
        return result;
        
    }
}