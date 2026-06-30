class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int pairs=0;
        for(int i=0;i<words.length;i++)
        {
            String st=words[i];
            int n=st.length();
            String ans="";
            for(int j=n-1;j>=0;j--)
            {
                ans=ans+st.charAt(j);
            }
            for(int k=i+1;k<words.length;k++)
            {
               if(ans!=st && ans.equals(words[k]))
               {
                   pairs++;
                   
               }
            }
            
        }
        return pairs;
        
    }
}