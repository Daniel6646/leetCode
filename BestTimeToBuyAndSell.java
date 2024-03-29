package leetCode;

public class BestTimeToBuyAndSell {

	 public static int  maxProfit(int[] prices) {
	        int lsf = Integer.MAX_VALUE;// least so far
	        int op = 0; // overall profit
	        int pist = 0; // profit if sold today
	        
	        
	        for(int i = 0; i < prices.length; i++){
	            if(prices[i] < lsf){
	                lsf = prices[i];
	                //System.out.println("lsf: "+lsf);
	            }
	            
	            pist = prices[i] - lsf;
	            if(op < pist){
	                op = pist;
	            }
	        }
	        return op;
	    }
	 
	 
	 public static void main(String[] args) {
		
		 int a[] = {7,6,4,3,1};
		 int b[] = {7,1,5,3,6,4};
//		 System.out.println("Profit for array a[]");
//		 System.out.println(maxProfit(a));
		 System.out.println("Profit for array b[]");
		 System.out.println(maxProfit(b));
		 
	}
	
}


//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
// 
//
//Example 1:
//
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//Example 2:
//
//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are done and the max profit = 0.