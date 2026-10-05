class Solution {
    public int countAsterisks(String s) {
        int bar=0;
        int asterisks=0;
        for(int i=0;i<s.length();i++){
        if(bar%2==0 && s.charAt(i)=='*')
        {
            asterisks++;
        }
        if(s.charAt(i)=='|')
        {
            bar++;
        }
    }
    return asterisks;
        
    }
}