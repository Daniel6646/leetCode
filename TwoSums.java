package leetCode;

public class TwoSums {

    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i<nums.length; i++) 
        {
            int num1 = nums[i];
            for(int j=i+1; j<nums.length; j++) 
            {
               int num2 = nums[j];
                if(num1 + num2 == target) 
                {
                    int result[] ={i,j};
                    return result;
                }
            }
        }
        return null;
    }
	
}

/*  Question  - Two Sums
 * Example 1: Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation:
 * Because nums[0] + nums[1] == 9, we return [0, 1].
 */
