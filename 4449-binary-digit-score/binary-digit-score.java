class Solution {
    public int calculateScore(int a, int b) {
        int s1=0,s2=0;
        while(a!=0)
        {
            int ld=a%2;
            if(ld%2!=0)
            {
                s1++;
            }
            a=a/2;
         }
        while(b!=0)
        {
            int ld=b%2;
            if(ld%2!=0)
            {
                s2++;
            }
            b=b/2;
         }
         if(s1>=s2)
         {
            return s1*s2;
         }
         else if(s1<s2)
         {
            return s2/s1;
         }
         return 0;
        
    }
}