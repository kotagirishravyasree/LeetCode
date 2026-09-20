class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int diff=s.charAt(i)-'a';
            int value=(26-diff)*(i+1);
            sum+=value;

        }
        return sum;
        
    }
}