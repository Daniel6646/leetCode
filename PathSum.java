package leetCode;

import javax.swing.tree.TreeNode;

public class PathSum {

	
	public boolean hasPathSum(TreeNode root, int sum) {    
		  if (root == null)
		     return false;
		        
		  if (root.left == null && root.right == null && root.val == sum) // Leaf check
		     return true;
		        
		  return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
		}
}
