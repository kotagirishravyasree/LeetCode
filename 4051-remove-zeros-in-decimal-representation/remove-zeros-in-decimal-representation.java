class Solution {
    public long removeZeros(long n) {
        long rev=0;
        while(n!=0)
        {
            long ld=n%10;
            if(ld!=0)
            {
                rev=rev*10+ld;
            }
            n=n/10;
        }
        StringBuilder sb=new StringBuilder(rev+"");
        sb.reverse();
        String s=sb.toString();
        long r=Long.parseLong(s);
        return r;
        
    }
}