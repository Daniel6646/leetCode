package leetCode;

import java.util.HashMap;

public class IsomorphicString {

public boolean isIsomorphic(String s, String t) {
        
        if(s == null  || s.length() <=1)
            return true;
        
        HashMap<Character,Character> map = new HashMap<Character, Character>();
        
        for(int i = 0; i < s.length(); i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);
            
            if(map.containsKey(a))
            {
                if(map.get(a).equals(b))
                    continue;
                        else
			 return false;
            } 
                else
                {
                    if(!map.containsValue(b))
                    
                        map.put(a,b);
                         else  return false;
                               
                }   
        }
            return true;
            
        }
}

/*
 * Tutorial for iaomorphic https://www.youtube.com/watch?v=6Qkail843d8
 */


/*
 * Two strings are isomorphic if the positions of the characters follow the same
 * pattern. So I'm using maps to compare the position patterns.
 * 
 * For example:
 * 
 * String 1: A B E A C D B index pattern: 0 1 2 0 4 5 1 String 2: X Y I X H K Y
 * index pattern: 0 1 2 0 4 5 1
 */
