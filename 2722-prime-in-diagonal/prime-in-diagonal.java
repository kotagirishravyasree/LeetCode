class Solution {
    public static boolean isPrime(int n){
         if (n < 2)
            return false;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
    int max=Integer.MIN_VALUE;
    public int diagonalPrime(int[][] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                if(i==j || i+j==nums.length-1)
                {
                    int n=nums[i][j];
                    boolean result=isPrime(n);
                    if(result && n>max){
                        max=n;
                    }
                    
                }
            }
        }
        if(max!=Integer.MIN_VALUE)
        return max;
        else
        return 0;
        
    }
}