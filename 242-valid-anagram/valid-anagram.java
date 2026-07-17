class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // String s1=Arrays.toString(arr1);
        // String s2=Arrays.toString(arr2);
        // if(s1.equals(s2)) return true;
        // return false;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
        
    }
}