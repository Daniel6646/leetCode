package leetCode;

public class ClimbingStairs {

	public int climbStairs(int n) {
	    if(n==0||n==1) return  1;
	    int stepOne=1,stepTwo=1;
	    int result=0;
	    for(int i=2;i<=n;i++){
	        result=stepOne+stepTwo;
	        stepTwo=stepOne;
	        stepOne=result;
	    }
	    return result;
	}
	
}
//
//
//Example 1:
//
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
//Example 2:
//
//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
// 
