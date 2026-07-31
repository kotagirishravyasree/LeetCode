class Solution {
    public int strStr(String haystack, String needle) {
        int i=0,j=0;
       if(!haystack.contains(needle))
       {
           return -1;
       }
       else
       {
         return haystack.indexOf(needle);

       }
    }
}