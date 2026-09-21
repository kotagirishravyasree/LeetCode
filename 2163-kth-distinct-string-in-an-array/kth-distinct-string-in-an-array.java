class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> mp=new LinkedHashMap<>();
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
           String st=arr[i];
           mp.put(st,mp.getOrDefault(st,0)+1);
        }
        for(String ele:mp.keySet())
        {
            if(mp.get(ele)==1)
            {
                if(count==k)
                {
                return ele;
                }
                else{
                    count++;
                }
            }

        }
        return "";
        
    }
}