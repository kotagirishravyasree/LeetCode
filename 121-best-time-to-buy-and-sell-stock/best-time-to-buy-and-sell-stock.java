class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int diff=0;
        int lowest=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<lowest)
            {
                lowest=prices[i];
            }
            else
            {
                diff=prices[i]-lowest;
            }
            if(profit<diff)
            {
                profit=diff;
            }
        }
        return profit;

        
    }
}