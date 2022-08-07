public class BuyAndSell {

    public int maxProfit(int[] prices) {
        
        // { T(n) = O(n)}

        int maxProfit = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            int profit = prices[i] - min;
            maxProfit = Math.max(maxProfit, profit);

        }
        return maxProfit;
    }

}

// Brute-Force Solution { T(n) = O(n^2)}

// class Solution {
//     public int maxProfit(int[] prices) {
//         int n = prices.length, maxProfit = 0;

//         for (int i = 0; i < n; i++) {

//             for (int j = i; j >= 0; j--) {

//                 int x = prices[i] - prices[j];

//                 maxProfit = Math.max(maxProfit, x);

//             }
//         }
//         return maxProfit;

//     }
// }