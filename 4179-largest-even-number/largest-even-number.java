class Solution {
    public String largestEven(String s) {
        int n=s.lastIndexOf('2');
        if(n==-1)
        {
            return "";
        }
        else
        {
            return s.substring(0,n+1);
        }
        
    }
}