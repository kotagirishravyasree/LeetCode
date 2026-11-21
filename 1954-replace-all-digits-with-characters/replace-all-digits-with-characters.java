class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(i%2!=0)
            {
                int num1=s.charAt(i-1);
                int num2=s.charAt(i)-'0';
                sb.append((char)(num1+num2));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
        
        
    }
}