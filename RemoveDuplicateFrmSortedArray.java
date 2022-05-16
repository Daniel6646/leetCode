package leetCode;

public class RemoveDuplicateFrmSortedArray {
	
	public int removeDuplicates(int[] nums) {
	      
	     //Here we declared a pointer to keep the track of previous index
	      int previous = 0;
	        
	        for(int i = 1; i < nums.length; i++)
	        {
	            //Condition used - if the integer at i'th index is not equal to integer at previous'th index then the condition is satisfies i.e both the integer are different
	            if(nums[i] != nums[previous])
	            {
	                //Incresing the previous by one to update its position by 1.
	                previous++;
	                
	                //Inserting the value at i'th index to the previous'th index
	                nums[previous] = nums[i];
	                //inserting value of number i at previous no that is 0 starting from 0th index
	            }
	        }
	               
	       return previous+1;
	    }

}


/*
 * Intution - Here we will traverse through the whole given array, but
 * simultaneously keep the pointer of the previous index which is stored. As we
 * traverse through the arrray, whenever we came across a new integer will
 * compare it with the previous one if both of them are different then will
 * store the new integer in new place and update the pointer. Once the the
 * traversal is complete will have all the unique integer at left side and thats
 * what we want. Simple isn't it.. Now lets look at the code.
 */

 
//ANOTHER SOL FOR SAME QUES.

/*
 * class Solution 
 * { public int removeDuplicates(int[] nums) 
 * 	{
 *  if(nums.length ==0) 
 *  return 0;
 *   int res = 1; 
 *   for(int i = 1; i < nums.length; i++)
 *    { 
 *   if(nums[i] !=nums[i - 1])
 *   	 {
 *    
 *   nums[res] = nums[i];
 *    res++;
 *    
 *       }
 *    }
 *       return res; 
 *    } 
 *  }
 */