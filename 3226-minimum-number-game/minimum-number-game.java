class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr=new int[nums.length];
        Arrays.sort(nums);
        int x=0;
        for(int i=0;i<nums.length;i+=2)
        {
            arr[x]=nums[i+1];
            arr[x+1]=nums[i];
            x+=2;

        }
        return arr;

        
    }
}