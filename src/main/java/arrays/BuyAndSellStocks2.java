package arrays;

/**
 * @author inayath on 15/04/25
 * @project dsa
 * 6/150, LC 122
 */
public class BuyAndSellStocks2 {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buySell(prices));
    }

    static int buySell(int[] prices){
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                profit += (prices[i] - prices[i-1]);
            }
        }

        return profit;
    }
}
