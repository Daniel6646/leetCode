package leetCode;

public class PlusOne {
	
public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1;i>=0;i--) 
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            else
            {
             digits[i]=0;   // in case of 999 if see 9 then 9+1 =0 so make that 9,, 0 then 999+1 is 1000 so new array +1 and make 1st element array[0] =1 as in 1000
            }
        }
          int array[] = new int[digits.length+1];
            array[0] = 1;
        return array;
        
    }

}
