/**

Given a binary tree, flatten it to a linked list in-place.

For example,
Given

         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6


 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void flatten(TreeNode root) {
        if(root == null || (root.left ==null && root.right ==null)) 
			return;

        if(root.left != null) {
		    TreeNode rootCopy = root;
    		root = root.left;
    		while(root.right != null){
	    		root = root.right;
		    }
		
    		root.right = rootCopy.right;
	    	root = rootCopy;
	    	root.right = root.left; 
		    root.left  = null;
        }
        
		flatten(root.right);
    }
}
