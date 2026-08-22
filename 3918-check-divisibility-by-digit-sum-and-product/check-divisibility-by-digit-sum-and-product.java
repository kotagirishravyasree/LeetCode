class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,product=1,originalNum=n;
        while(n!=0)
        {
            int ld=n%10;
            sum+=ld;
            product*=ld;
            n=n/10;
        }
        if((sum+product)!=0 && originalNum%(sum+product)==0)
        {
            return true;
        }
        else
        {
        return false;
        }
        
    }
}