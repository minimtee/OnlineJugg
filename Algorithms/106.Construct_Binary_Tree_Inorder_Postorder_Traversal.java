/**

Given inorder and postorder traversal of a tree, construct the binary tree.

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        		int len = inorder.length;
		int pivot = 0;

		if(postorder.length ==1 && inorder.length == 1)
			return new TreeNode(postorder[len-1]);
		if(postorder.length ==0 && inorder.length == 0)
			return null;

		TreeNode node = new TreeNode(postorder[len-1]);

		for(int i=len-1;i>=0;i--){
			if(inorder[i] == postorder[len-1]){
				pivot = i;break;
			}
		}

		int leftChildLen = pivot;
		int[] leftChildInorder   = new int[leftChildLen];
		int[] leftChildPostorder = new int[leftChildLen];
		for (int i=0;i<leftChildLen ;i++ ) {
			leftChildInorder[i]   = inorder[i];
			leftChildPostorder[i] = postorder[i];
		}
		node.left = buildTree(leftChildInorder,leftChildPostorder);

		int rightChildLen = len-leftChildLen-1;
		int[] rightChildInorder   = new int[rightChildLen];
		int[] rightChildPostorder = new int[rightChildLen];
		for (int i=0;i<rightChildLen ;i++ ) {
			rightChildInorder[i]  = inorder[i+leftChildLen+1];
			rightChildPostorder[i] = postorder[i+leftChildLen];
		}
		node.right = buildTree(rightChildInorder,rightChildPostorder);
		
		return node;	
    }
}
