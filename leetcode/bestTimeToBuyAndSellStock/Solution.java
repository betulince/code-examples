class Solution {
    public int maxProfit(int[] prices) {

        // 1. the day you buy the stock needs to come earlier than the day you sell the stock
        // 2. you need to buy for a price lower than what you sell to be able to make a profit

        int candidate = prices[0];
        int profit = 0;
        int maxProfit = 0;

        for (int i=1; i<prices.length; i++) {
            if (candidate < prices[i]) {
                profit = prices[i] - candidate;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                candidate = prices[i];
            }
        }
        return maxProfit;
    }
}