package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
public List<List<Integer>> generate(int numRows) {
        
        if(numRows ==0)
        {
            return new ArrayList();
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=1; i <= numRows; i++)
        {
            List<Integer> row = new ArrayList();
            for(int j=0;j<i;j++)
            {
                if(j==0 || j==i-1)
                {
                    row.add(1);
                }
                else
                {
                 row.add(result.get(i-2).get(j) + result.get(i-2).get(j-1));
                }
            }
            result.add(row);
        }
        return result;
        
    }

}

//refer video for explanation
//https://www.youtube.com/watch?v=ZFgJrfbaXT8

/*
 * alternate solution class Solution { public List<List<Integer>> generate(int
 * numRows) { List<List<Integer>> res = new ArrayList(); List<Integer> row = new
 * ArrayList(); for(int i = 0; i < numRows; i++) { for(int j = row.size() - 1; j
 * >= 1 ; j--) { row.set(j, row.get(j) + row.get(j - 1)); } row.add(1);
 * res.add(new ArrayList(row)); } return res; } }
 */
