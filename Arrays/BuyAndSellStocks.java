package Arrays;

public class BuyAndSellStocks {
    public static int stocks(int arr[]){
        int buyPrice=arr[0];
        int maxProfit = 0;
        int profit;
        for(int i =1; i<arr.length;i++){
            if(buyPrice> arr[i]){
                buyPrice = arr[i];
            }
            profit = arr[i]- buyPrice; //todays profit
            if(profit > maxProfit){
                maxProfit=profit;   //global profit
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(stocks(prices));  //max profit possible
    }
}
