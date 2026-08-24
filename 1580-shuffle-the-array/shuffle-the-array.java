class Solution {
    public int[] shuffle(int[] nums, int n) {
        int mid=nums.length/2;
        int[] arr=new int[2*n];
        int x=1;
        arr[0]=nums[0];
        for(int i=1;i<2*n;i++)
        {
            if(i%2!=0)
            {
                arr[i]=nums[mid];
                mid++;
            }
            else
            {
                arr[i]=nums[i-x];
                x++;

            }
            
        }
        return arr;
        
    }
}