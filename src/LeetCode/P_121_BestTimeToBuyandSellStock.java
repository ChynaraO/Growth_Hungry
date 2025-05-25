package LeetCode;

public class P_121_BestTimeToBuyandSellStock {
    public static int maxProfit(int[] prices){
        int highest_profit = 0;
        int lowest_price_so_far = prices[0];
        for(int today_price : prices){
            highest_profit = Math.max(highest_profit, today_price-lowest_price_so_far);
            lowest_price_so_far = Math.min(today_price, lowest_price_so_far);
        }
        return highest_profit;
    }

    public static void main(String[] args) {
        int [] prices = {1,4,7,1,5};
        System.out.println("The highest profit: " + maxProfit(prices));
    }
}
