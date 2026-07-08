class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        for(int k=1;k<=s.length/2;k++)
        {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        
    }
}