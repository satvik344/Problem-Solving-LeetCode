class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int j=0;
        for(int i = 1; i<prices.length; i++){
           if (prices[i]<prices[j]){
            prices[j]=prices[i];
           }
           else if(prices[i]-prices[j]>profit){
            profit = prices[i]-prices[j];
           }
                }
                return profit;
            }
        }