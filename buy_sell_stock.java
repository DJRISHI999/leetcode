class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            // Debugging: Print current price and buy value
            System.out.println("Day " + i + ": Current Price = " + prices[i] + ", Buy = " + buy);

            if (buy > prices[i]) {
                buy = prices[i];
                // Debugging: Print updated buy value
                System.out.println("Updated Buy = " + buy);
            }
            if (profit < prices[i] - buy) {
                profit = prices[i] - buy;
                // Debugging: Print updated profit value
                System.out.println("Updated Profit = " + profit);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Solution obj = new Solution();
        System.out.println("Maximum Profit: " + obj.maxProfit(prices));
    }
}