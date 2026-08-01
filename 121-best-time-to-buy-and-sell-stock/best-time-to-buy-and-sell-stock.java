class Solution {
    public int maxProfit(int[] prices) {
      int profit = prices[0];
      int maxProfit = 0;
      for(int i=1;i<prices.length;i++){
        maxProfit = Math.max(maxProfit,prices[i]-profit);
        if(prices[i]<profit){
            profit = prices[i];
        }
       
      }
      return maxProfit;
    }
}