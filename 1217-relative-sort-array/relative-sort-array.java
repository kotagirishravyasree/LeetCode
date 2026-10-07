class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> hm=new TreeMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<arr2.length;i++)
        {
            int num=hm.get(arr2[i]);
            while(num>0)
            {
                list.add(arr2[i]);
                num--;
            }
        }
        for(int ele:hm.keySet())
        {
            if(!list.contains(ele))
            {
                int num=hm.get(ele);
                while(num>0)
                {
                  list.add(ele);
                  num--;
                }
            }
        }
        for(int i=0;i<list.size();i++)
        {
            arr1[i]=list.get(i);
        }
        return arr1;

        
        
    }
}