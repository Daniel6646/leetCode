package leetCode;

public class MaximumSubarray {
	
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }
	

}


/*
 * Intution: Start traversing your array keep each element in the sum and every
 * time keep the max of currSum and prevSum. But the catch here is that if at
 * any point sum becomes negative then no point keeping it because 0 is
 * obviously greater than negative, so just make your sum 0.
 * 
 * 
 * index -         0  1   2  3   4  5  6   7  8 
 * 
 * int nums[] = { -2, 1,- 3, 4,- 1, 2, 1, -5, 4 }
 * 
 * i =0 sum = 0 + -2 = -2 , max =2 -2 sum < 0 then sum = 0
 * 
 * i =1 sum = 0+! =1 , max =1 1
 * 
 * i =2 sum = 1 + (-3) = -2, max = 1 1 sum < 0 then sum =o
 * 
 * i = 3 sum = 0+4 = 4 , max = 4 4
 * 
 * i=4 sum = 4+(-1) = 3 max = 4 4 -1
 * 
 * i = 5 sum = 3 + 2 = 5, max = 5 4 -1 2
 * 
 * i = 6 sum = 5 + 1 = 6, max = 6 4 -1 2 1
 * 
 * i = 7 sum = 6 + (-5) = 1 , max = 6 4 -1 2 1
 * 
 * i=8 sum = 1 + 4 = 5, max = 6 4 -1 2 1
 * 
 * max sum we got is 6 and the sub array is 4 -1 2 1
 */