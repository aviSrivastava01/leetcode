package main;

class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
         int maxProfit = 0, max = 0;
    for(int i = 0; i < prices.length; i++) {
        if(prices[i] < minPrice) minPrice = prices[i];
        else {
            maxProfit += Math.max(prices[i] - minPrice, max);
            minPrice = prices[i];
        }
    }
    
    return maxProfit;
}
    
    public static void main (String[] args) {
    	int[] arr = new int[] {1,2,3,4,5};
    	maxProfit(arr);
    } 
}