package leetCode;

public class ExcelSheetColumnNumber {
	   public int titleToNumber(String s) {
	        if (s == null) return -1;
	        int sum = 0;
	        // for each loop so we don't need to mess with index values.
	        for (char c : s.toUpperCase().toCharArray()) {
	            sum *= 26;
	            sum += c - 'A' + 1;
	        }
	        return sum;
	    }

}

/*Question
 * t sir still i have a confusion about : int d=c-'A'+1; please sir explain me..
 * 
 * Answer
 * d is simply mapping character c to integer. c is a character like 'A', 'B'..
 * etc ascii of 'A' = 65, 'B' = 66.. etc. But, we have to map 'A' to 1, 'B' to
 * 2... 'Z' to 26. So, lets say c = 'B', then d = 'B' - 'A' + 1 = 2 So, for 'B'
 * we got 2 as d, which is what we want here.

 *Sir I am having confusion in this line....  result = result*26 + d. Could you please explain it sir ?
 *
 *Answer
 *
Knowledge Center
17 hours ago
Just like in decimal you you have 10 digits, so if you have to calculate the value of a string in decimal say "348", what you write:
3*10*10 + 4*10 + 8
Programatically:
result = 0
for all characters c in "348"
      result*10 + c
It will execute as:
result = 0
c = 3: result = result*10 + 3 = 3
c = 4: result = result*10 + 4 = 34
c = 8: result = result*10 + 8 = 348

Similarly in in this problem there are 26 digits instead of 10. A = 1, B = 2, ... Z = 26
So, say we wan to find column index of "ACD" it is (A*26*26) + (C*26) + D = (1*26*26) + (3*26) + 4
 */


