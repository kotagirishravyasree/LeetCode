class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list= new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int n=2;
        for(int i=min;i<max;i++)
        {
            boolean present=false;
            int ele=min+(n-1);
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==ele)
                {
                    present=true;
                    break;
                }
            }
            if(present==false)
            {
                list.add(ele);
            }
            n++;
        }
        return list;

        
    }
}