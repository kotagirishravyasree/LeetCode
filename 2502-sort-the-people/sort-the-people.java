class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] result=new String[heights.length];
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<heights.length;i++)
        {
            hm.put(heights[i],i);
        }
        Arrays.sort(heights);
        int idx=0;
        for(int i=heights.length-1;i>=0;i--)
        {
            int index=hm.get(heights[i]);
            result[idx++]=names[index];
        }
        return result;
        
        
    }
}