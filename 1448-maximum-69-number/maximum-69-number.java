class Solution {
    public int maximum69Number (int num) {
        int maxValue=num;
        int ans=0;
        String s=num+"";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String newString="a";
            if(ch=='9')
            {
              newString=s.substring(0,i)+"6"+s.substring(i+1,s.length());
            }
            else
            {
              newString=s.substring(0,i)+"9"+s.substring(i+1,s.length());
            }
            int n=Integer.parseInt(newString);
            {
                ans=Math.max(n,maxValue);
                maxValue=ans;
            }

        }
        return ans;
        
    }
}