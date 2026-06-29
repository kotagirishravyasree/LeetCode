class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<jewels.length();i++)
        {
            char jch=jewels.charAt(i);
            for(int j=0;j<stones.length();j++)
            {
                char sch=stones.charAt(j);
                if(jch==sch)
                {
                    count=count+1;
                }
            }
        }
        return count;
        
    }
}