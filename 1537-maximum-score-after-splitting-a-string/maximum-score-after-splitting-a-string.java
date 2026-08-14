class Solution {
    public int maxScore(String s) {
        int max=0;
        for(int i=1;i<s.length();i++)
        {
            String s1=s.substring(0,i);
            String s2=s.substring(i,s.length());
            int j=0;
            int k=0;
            int leftSum=0,rightSum=0;
            int totalSum=0;
            while(j<s1.length())
            {
                if(s1.charAt(j)=='0')
                {
                   leftSum++;
                }
                j++;
            }
            while(k<s2.length())
            {
                if(s2.charAt(k)=='1')
                {
                   rightSum++;
                }
                k++;
            }
            totalSum=leftSum+rightSum;

            if(max<totalSum)
            {
                max=totalSum;
            }

        }
        return max;
        
    }
}