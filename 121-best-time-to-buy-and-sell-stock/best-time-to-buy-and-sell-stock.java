class Solution {
    public int maxProfit(int[] prices) {
        int cheapest_price = prices[0];
        int profit =0;
        int maxProfit =0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<cheapest_price){
                 cheapest_price=prices[i];
            }
            profit = prices[i]-cheapest_price;
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}