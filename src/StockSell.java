public class StockSell {

//    Say you have an array for which the ith element is the price of a given stock on day i.
//
//    If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//
//    Note that you cannot sell a stock before you buy one.
//
//            Example 1:
//
//    Input: [7,1,5,3,6,4]
//    Output: 5
//    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//    Not 7-1 = 6, as selling price needs to be larger than buying price.
//    Example 2:
//
//    Input: [7,6,4,3,1]
//    Output: 0
//    Explanation: In this case, no transaction is done, i.e. max profit = 0.


    public static int maxProfit(int[] prices) {

        //no stock can be sold
        if (prices == null) {
            return 0;
        }

        int buyDay = 0;
        int maxProfit = 0;
        for (int day = 1; day < prices.length; day++) {
            //update maxProfit
            int currentProfit = prices[day] - prices[buyDay];
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            } else if (currentProfit < 0) {
                //update buyDay
                buyDay = day;
            }
        }
        return maxProfit;
    }

    public static int maxProfit2(int[] prices) {

        //no stock can be sold
        if (prices == null) {
            return 0;
        }

        int currentProfit = 0;
        int maxProfit = 0;
        for (int day = 1; day < prices.length; day++) {
            //update maxProfit
            int delta = prices[day] - prices[day - 1];
            currentProfit = Math.max(0, currentProfit + delta);
            maxProfit = Math.max(currentProfit, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String args[]) {

        int[] price = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit2(price));
    }
}
