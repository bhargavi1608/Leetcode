class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minCost = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minCost){
                minCost=prices[i];
            }
            profit=Math.max(profit,prices[i]-minCost);
        }
        return profit;
    }
   
}