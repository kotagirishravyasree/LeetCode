class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)
        {
            return false;
        }
        int num1=n-10;
        int num2=9;
        int count=1;
        while(num1>=num2)
        {
            count++;
            num1=num1-num2;
            num2--;
        }
        if(count%2!=0)
        {
            return true;
        }
        return false;
        
        
    }
}