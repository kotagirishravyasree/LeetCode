class Solution {
    public boolean checkString(String s) {
        int lastIdx=s.lastIndexOf('a');
        if(lastIdx==-1)
        {
            return true;
        }
        for(int i=0;i<lastIdx;i++){
            if(s.charAt(i)=='b')
            {
                return false;
            }
        }
        return true;
        
    }
}