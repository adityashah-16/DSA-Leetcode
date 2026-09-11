class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit =0;
        int buyprice = prices[0];
        for(int i =1;i<prices.length;i++)
        {
            int currentprofit= prices[i]-buyprice;
            if(currentprofit > maxprofit)
            {
                maxprofit=currentprofit;
            }
            if(prices[i]<buyprice)
            {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
}