/*The cost of a stock on each day is given in an array. 
Find the maximum profit that you can make by buying and selling on those days.
If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.

/*Input: arr[] = {100, 180, 260, 310, 40, 535, 695}
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
            Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
            Maximum Profit  = 210 + 655 = 865

Input: arr[] = {4, 2, 2, 2, 4}
Output: 2
Explanation: Buy the stock on day 1 and sell it on day 4 => 4 – 2 = 2
             Maximum Profit  = 2 */

public class Stock {

    // Brute Force
    public static int maxprofit(int price[], int start, int end) {
        // base case: if end index is less than or equal to start index, return 0 as no
        // transaction is possible
        if (end <= start)
            return 0;

        // initialize profit to 0
        int profit = 0;

        // nested loops to iterate through all possible pairs of buy and sell points
        // within the price range
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                // if buying at lower price and selling at higher price yields profit
                if (price[j] > price[i]) {
                    // calculate current profit as the difference between the selling and buying
                    // price,
                    // plus the maximum profits that can be obtained by buying and selling stocks
                    // before the current buying point (i.e., between start and i-1),
                    // and after the current selling point (i.e., between j+1 and end).
                    int curr_profit = price[j] - price[i] + maxprofit(price, start, i - 1)
                            + maxprofit(price, j + 1, end);

                    // update the maximum profit
                    profit = Math.max(profit, curr_profit);
                }
            }
        }

        // return the maximum profit that can be obtained by buying and selling stocks
        // within the given price range
        return profit;
    }

    // Efficient Solution
    /*
     * It does this by iterating through the array and calculating the difference
     * between each adjacent pair of prices.
     * If the price on the current day is higher than the previous day,
     * the function adds the difference between the prices to the total profit.
     */
    public static int maxprofit2(int price[]) {
        int profit = 0;

        // iterate through the array of prices
        for (int i = 1; i < price.length; i++) {
            // check if the current price is higher than the previous price
            if (price[i] > price[i - 1]) {
                // if so, add the difference between the prices to the total profit
                profit += (price[i] - price[i - 1]);
            }
        }

        // return the maximum profit that can be obtained by buying and selling stocks
        return profit;
    }

    public static void main(String[] args) {
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        int start = 0;
        int end = price.length;
        int profit = maxprofit2(price);
        System.out.println("Max Profit is: " + profit);
    }
}
