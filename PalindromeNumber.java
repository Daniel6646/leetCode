package leetCode;

public class PalindromeNumber {
	
	 public boolean isPalindrome(int x) {
	        if (x < 0) {
	            return false;
	        }
	        
	        int num = x;
	        int reversed = 0;
	        while (num != 0) {
	            reversed = reversed * 10 + num % 10;
	            num /= 10;
	        }
	        
	        return x == reversed;
	    }
}


/* Example 1:
 * Input: x = 121 Output: true Explanation: 121 reads as 121 from left to right
 * and from right to left
 */

	
/*
 * Example 2: 
 * Input: x = -121 Output: false Explanation: From left to right, it reads -121.
 * From right to left, it becomes 121-. Therefore it is not a palindrome
 */