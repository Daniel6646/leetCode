package leetCode;

import java.util.HashSet;

public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!set.add(nums[i]))
				return true;
		}
		return false;
	}
}



/*
 *   ALTERNATE SOLUTION
 * 

 * class Solution { public boolean containsDuplicate(int[] nums) {
 * Arrays.sort(nums); for (int i = 1; i < nums.length; i++) { if (nums[i] ==
 * nums[i - 1]) return true; } return false; } }
 */

