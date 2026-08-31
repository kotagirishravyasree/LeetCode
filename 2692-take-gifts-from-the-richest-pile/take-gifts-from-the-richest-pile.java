class Solution {
    public long pickGifts(int[] gifts, int k) {
        for(int j=1;j<=k;j++)
        {
            int max=gifts[0];
            int index=0;
            for(int i=0;i<gifts.length;i++)
            {
                if(max<gifts[i])
                {
                    max=gifts[i];
                    index=i;
                }
            }
            gifts[index]=(int)(Math.floor(Math.sqrt(max)));
        }
        long sum=0;
        for( int i=0;i<gifts.length;i++)
        {
            sum+=gifts[i];
        }
        return sum;

        
    }
}