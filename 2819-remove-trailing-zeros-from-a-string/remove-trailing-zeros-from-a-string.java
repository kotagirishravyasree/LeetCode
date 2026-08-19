class Solution {
    public String removeTrailingZeros(String num) {
        int i=0,j=num.length()-1;
        for(int k=0;k<num.length();k++)
        {
            if(num.charAt(j)=='0')
            {
                j--;
            }
            else
            {
                break;
            }
        }
        return num.substring(i,j+1);
        
    }
}