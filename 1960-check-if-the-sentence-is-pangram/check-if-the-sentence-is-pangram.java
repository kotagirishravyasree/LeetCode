class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq=new int[26];
        for(char ch:sentence.toCharArray())
        {
            freq[ch-'a']++;
        }
        for(int val:freq)
        {
            if(val==0)
            {
                return false;
            }
        }
        return true;
        
    }
}