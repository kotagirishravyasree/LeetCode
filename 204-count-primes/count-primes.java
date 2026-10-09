class Solution {
    static boolean[] prime;
    static int[] prefix;
    static{
    int N=5*1000000;
    prime=new boolean[N+1];
    prefix=new int[N+1];
    Arrays.fill(prime,true);
    prime[0]=false;prime[1]=false;
    prefix[0]=0;prefix[1]=0;
    for(int i=2;i*i<=N;i++)
    {

        if(prime[i]==true)
        {
            for(int j=i*i;j<=N;j+=i)
            {
                prime[j]=false;
            }
        }
    }
    for(int i=2;i<=N;i++)
    {
        prefix[i]=prefix[i-1]+(prime[i]==true?1:0);
    }
    }

    public int countPrimes(int n) {
        
        if(n==0){
            return 0;
        }
        return prefix[n-1];
    }
    
}