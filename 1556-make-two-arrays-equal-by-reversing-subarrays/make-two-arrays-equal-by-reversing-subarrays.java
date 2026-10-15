class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        String s1=Arrays.toString(arr);
        String s2=Arrays.toString(target);
        if(s1.equals(s2))
        {
            return true;
        }
        return false;
        
    }
}