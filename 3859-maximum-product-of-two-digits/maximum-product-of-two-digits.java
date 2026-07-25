class Solution {
    public int maxProduct(int n) {
        String s=new String(""+n);
        char[] arr1=s.toCharArray();
        int[] arr2=new int[arr1.length];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=arr1[i]-'0';
        }
        Arrays.sort(arr2);
        return arr2[arr2.length-1]*arr2[arr2.length-2];
        
    }
}