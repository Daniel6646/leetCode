package leetCode;

public class SingleNums {

	public int singleNumber(int[] nums) {
		int result = 0;
		for (int i : nums) {
			result ^= i;
		}
		return result;

	}
}


/*
 * 
 
 * The ^ is a bitwise XOR operator. It works like this: 00010 ^ 00010 = 00000;
 * 00000 ^ 10101 = 10101; In other words, if two integers of the same value (and
 * bit representation) are XORed together, the expression evaluates to all 0s.
 * If a number is XORed with all 0s, the expression evaluates to the number
 * itself. These are both properties of the XOR function. XORing the entire
 * array together will eliminate all the duplicates (they will all be set to 0)
 * and leave only the single number.
 */

/*
 * //in simple words any number with itself becomes 0 so we are left with the
 * only unique number see above for more info
 */