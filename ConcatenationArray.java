package leetCode;

public class ConcatenationArray {
	
	public int[] getConcatenation(int[] nums) {
		int[] result = new int[nums.length * 2];
		for(int i=0;i<nums.length;i++) {
			result[i + nums.length] = result[i] = nums[i];
		}
		return result;
	
  }
	
	public static void main(String args[]) {
		
	}
}
