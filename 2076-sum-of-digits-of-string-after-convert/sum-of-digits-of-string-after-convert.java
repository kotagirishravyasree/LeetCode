class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String ans=((int)ch-(int)'a'+1)+"";
            sb.append(ans);
        }
        int sum=0;
        for(int i=0;i<k;i++){
            sum=0;  
        for(int j=0;j<sb.length();j++)
        {
            int n=sb.charAt(j)-'0';
            sum+=n;
        }
        if(sum>=0 && sum<=9)
        {
           break;
        }
        else{
            sb=new StringBuilder(String.valueOf(sum));
        }
        }
        return sum;
        
    }
}