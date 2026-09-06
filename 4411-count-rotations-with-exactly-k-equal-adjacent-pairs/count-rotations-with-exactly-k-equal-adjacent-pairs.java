class Solution {
    public int countRotations(String s, int k) {
        int count=0;
        int n=s.length();
            for(int r=0;r<n;r++)
            {
                String rotated=s.substring(r)+s.substring(0,r);
                int pairs=0;
                for(int j=0;j<n-1;j++)
                {
                    if(rotated.charAt(j)==rotated.charAt(j+1))
                    {
                        pairs++;
                    }
                }
                if(pairs==k)
                {
                    count++;
                }
            }
        return count;
        
    }
}