class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set=new HashSet<>();
        int num=candyType.length/2;
        for(int i=0;i<candyType.length;i++)
        {
            set.add(candyType[i]);
            if(set.size()==num)
            {
                break;
            }
        }
        return set.size();
        
    }
}