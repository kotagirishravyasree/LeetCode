class Solution {
    public boolean isPathCrossing(String path) {
        Set<List<Integer>> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(0);
        set.add(list);
        int i=0,j=0;
        for(int k=0;k<path.length();k++)
        {
            List<Integer> list1=new ArrayList<>();
            if(path.charAt(k)=='N')
            {
                j++;
                list1.add(i);
                list1.add(j);
                if(set.contains(list1))
                {
                    return true;
                }
                else{
                    set.add(list1);
                }
            }
            else if(path.charAt(k)=='E')
            {
                i++;
                list1.add(i);
                list1.add(j);
                if(set.contains(list1))
                {
                    return true;
                }
                else{
                    set.add(list1);
                }
            }
            else if(path.charAt(k)=='S')
            {
                j--;
                list1.add(i);
                list1.add(j);
                if(set.contains(list1))
                {
                    return true;
                }
                else{
                    set.add(list1);
                }
            }
            else if(path.charAt(k)=='W')
            {
                i--;
                list1.add(i);
                list1.add(j);
                if(set.contains(list1))
                {
                    return true;
                }
                else{
                    set.add(list1);
                }
            }

            

            
        }
        return false;
        
    }
}