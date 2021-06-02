class BestTimeToBuyShares {
    // method 1 using kadane's algo 
    // static  int maxProfit(int[] prices) {
    //     int curr = 0, profit = 0;
    //     for(int i = 1; i < prices.length; i++) {
    //         curr += prices[i] - prices[i-1];
    //         curr = Math.max(0, curr);
    //         profit = Math.max(profit, curr);
    //     }
    //     return profit;
    // }
    
    // method 2
    static  int maxProfit(int[] prices) {
        int min = prices[0], profit = 0;
        for(int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }

    public static void main(String args[]) {
        int prices[] = {7,1,5,3,6,4};
        System.out.print(maxProfit(prices));
    }
}