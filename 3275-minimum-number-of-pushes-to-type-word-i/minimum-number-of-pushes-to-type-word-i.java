class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        if(n>=1 && n<=8)
        {
            return n;
        }
        else if(n>=9 && n<=16)
        {
            if(n==16)
            {
                return 24;
            }
            int x=n%8;
            return 8+2*x;
        }
        else if(n>=17 && n<=24)
        {
            if(n==24)
            {
               return 48; 
            }
            int x=n%8;
            return 24+3*x;
        }
        else
        {
            return 8+8*2+8*3+(n%8*4);
        }
        
    }
}