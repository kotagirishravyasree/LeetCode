class Solution {
    public boolean isPerfectSquare(int num) {
        long low=0;
        long high=100000;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            long res=mid*mid;
            if(res==num)
            {
                return true;
            }
            else if(res<num)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
        
    }
}