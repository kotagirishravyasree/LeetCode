class Solution {
    public long minimumSteps(String s) {
        long swaps=0;
        int onesCount=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                onesCount++;
            }
            else{
                swaps+=onesCount;
            }
        }
        return swaps;
    }
}