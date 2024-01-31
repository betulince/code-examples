class Solution {

    // Greedy algorithm
    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        for (int i=1; i<prices.length; i++) {
            if (prices[i] > prices[i-1]) { // if current day's price higher than the previous, make a profit
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}