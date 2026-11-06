class Solution {
    public String thousandSeparator(int n) {
        String s=n+"";
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(count==3)
            {
                sb.append(".");
                count=0;
            }
            sb.append(s.charAt(i));
            count++;
            
        }
        sb.reverse();
        return sb.toString();

        
    }
}