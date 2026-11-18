
class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int count=0;

        int temp=n;
        int digits=0;

        while(temp!=0)
        {
            digits++;
            temp=temp/10;
        }

        while(n!=0)
        {
            int ld=n%10;

            if((digits-count)%2==0)
            {
                ld=ld*(-1);
            }

            sum=sum+ld;
            count++;
            n=n/10;
        }

        return sum;
    }
}
