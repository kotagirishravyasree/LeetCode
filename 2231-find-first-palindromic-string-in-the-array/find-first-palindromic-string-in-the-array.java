class Solution {
    public String firstPalindrome(String[] words) {
        String ans="";
        int flag=-1;
        for(int k=0;k<words.length;k++)
        {
            String s=words[k];
            int i=0,j=s.length()-1;
            while(i<=j)
            {
                flag=1;
                if(s.charAt(i)!=s.charAt(j))
                {
                   flag=0;
                   break;
                }
                i++;
                j--;
            }
            if(flag==1)
            {
                // ans+=s;
                // break;
                return s;
            }
        }
        return ans;
        
    }
}