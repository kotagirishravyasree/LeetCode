class Solution {
    
        static int[] tri;
        static{
            int N=38;
            tri=new int[N+1];
            tri[0]=0; 
            tri[1]=1; 
            tri[2]=1;
            for(int i=3;i<=N;i++) 
            {
                tri[i]=tri[i-1]+tri[i-2]+tri[i-3];
            }
        }

    
    public int tribonacci(int n) {
        int ans=0;
        ans=tri[n];
        return ans;
        
    }
}