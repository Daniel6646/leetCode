package leetCode;

public class LengthofLastWord {

	public int lengthOfLastWord(String s) {
		int length = 0;

		// We are looking for the last word so let's go backward
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') { // a letter is found so count
				length++;
			} else { // it's a white space instead
				// Did we already started to count a word ? Yes so we found the last word
				if (length > 0)
					return length;
			}
		}
		return length;
	}
}

/*
 * Question Example 1:
 * 
 * Input: s = "Hello World" Output: 5 Explanation: The last word is "World" with
 * length 5. Example 2:
 * 
 * Input: s = "   fly me   to   the moon  " Output: 4 Explanation: The last word
 * is "moon" with length 4. Example 3:
 * 
 * Input: s = "luffy is still joyboy" Output: 6 Explanation: The last word is
 * "joyboy" with length 6.
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 104 s consists of only English letters and spaces ' '. There
 * will be at least one word in s.
 */



/*
 * public class LengthofLastWord {
 * 
 * public int lengthOfLastWord(String s) { char[] chars =
 * s.trim().toCharArray(); // use .trim() to handle the case with trailing
 * spaces int result = 0; for (int i = chars.length - 1; i >= 0; i--) { if
 * (chars[i] != ' ') { result++; } else { break; // the space character is
 * found, so stop the loop and return the result } } return result; }
 * 
 * }
 */
