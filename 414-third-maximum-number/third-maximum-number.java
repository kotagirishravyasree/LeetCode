class Solution {
    public int thirdMax(int[] nums) {
        TreeMap <Integer,Integer> tm=new TreeMap <> ();
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            tm.put(n,tm.getOrDefault(n,0)+1);
        }
        int count=0;
        int ans=0;
        if(tm.size()>=3){
        for(int ele:tm.keySet())
        {
            
            ans = ele;
            if(count==tm.size()-3)
            {
              break;
            }
            count++;
            

        }
        }
        else
        {
            for(int ele:tm.keySet())
            {
              count++;
              ans = ele;
              if(count==tm.size())
              {
                break;
              }
            }

        }
        return ans;
        

        
    }
}