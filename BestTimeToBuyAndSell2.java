package leetCode;

public class BestTimeToBuyAndSell2 {

	
	   public static int maxProfit(int[] prices) {
	        
	        int max = 0;
	        
	        for(int i=0; i<prices.length; i++){
	               for(int j=i+1; j<prices.length; j++){
	                   if(prices[j]>prices[i]){
	                       int diff = prices[j]-prices[i];
	                       if(diff>max)
	                           max = diff;
	                   }
	               }
	        }
	        
	        return max;
	    }
	   
	   
	   public static void main(String[] args) {
		
		   int a[] = {7,1,5,3,6,4};
		   System.out.println(maxProfit(a));
	}
	   
}

