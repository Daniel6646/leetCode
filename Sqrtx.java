package leetCode;

public class Sqrtx {
	
	 public int mySqrt(int x) {
	        if(x <= 1) return x;
	        int start = 1;
	        int end = x/2;
	        
	        while(start < end) {
	            // start is not always moving and hence we can get stuck in infinite loop with mid calculation
	            // Adding 1 to mid everytime to ensure we always move the mid
	            int mid = (start + (end-start)/2) + 1;
	            
	            // use division instead of multiplication to avoid overflow
	            int div = x/mid;
	            if(div == mid) return mid;
	            if(div > mid) start = mid;
	            else end = mid-1;
	        }
	        
	        return start;
	    } 

}


/*
 * Approach:
 * 
 * Intuitive Brute force solution would be O(n) as we check every element from 0
 * to x/2 The next better time complexity we can target it O(logN) which
 * suggests at using binary search. Algorithm:
 * 
 * start with a range between 1 to x/2 (square root of any number can not be
 * greater than half of the number) find the mid point and calculate the x/mid
 * as quotient we go for division instead of multiplication to avoid unwanted
 * overflow If quotient == mid; we have our answer If quotient > mid; move start
 * to mid; not to mid + 1 as mid might be a valid answer if quotient < mid; move
 * end to mid-1
 */


/*
 * @ajinkya_ap : In our ideal situation mid * mid = x
 * 
 * Replace div with x/mid in all cases Case 1: div == mid => x/mid = mid => x ==
 * mid*mid => return our answer Case 2: div > mid => x/mid > mid => x > mid*mid
 * => move start to mid (go to right half) Case 3: div < mid => x/mid < mid => x
 * < mid*mid => move end to mid-1(go to left half)
 * 
 * Hope this clarifies the approach. :)
 */