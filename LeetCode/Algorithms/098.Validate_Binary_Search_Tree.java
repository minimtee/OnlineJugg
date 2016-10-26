/**

Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

		boolean isLeftSmall = false ;
		if(root.left == null){
			isLeftSmall = true;
		}else{
			if(maxVal(root.left) < root.val) isLeftSmall = true;
		}

		boolean isRightBig  = false ;
		if(root.right == null){
			isRightBig = true;
		}else{
			if(minVal(root.right) > root.val) isRightBig = true;
		}

		return(isRightBig && isLeftSmall && isValidBST(root.left) && isValidBST(root.right));
    }
    
    public int maxVal(TreeNode root){
        
        int max = root.val;
        
        if(root.left == null && root.right ==null) return max;
        
        if(root.left != null){
            int leftMax = maxVal(root.left);
            if(leftMax > max) max =leftMax; 
        }
        if(root.right != null){
            int rightMax = maxVal(root.right);
            if(rightMax > max) max =rightMax; 
        }
        
        return max;
    }
    
    public int minVal(TreeNode root){
        
        int min = root.val;
        
        if(root.left == null && root.right ==null) return min;
        
        if(root.left != null){
            int leftMin = minVal(root.left);
            if(leftMin < min) min =leftMin; 
        }
        if(root.right != null){
            int rightMin =minVal(root.right);
            if(rightMin < min) min =rightMin; 
        }
        
        return min;
    }
}
