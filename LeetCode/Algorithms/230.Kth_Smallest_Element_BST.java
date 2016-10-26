/**

Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note: 
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<Integer> values = new LinkedList<>();

		findValue(root,values,k);

		return values.get(k-1);
    }
    
    public void findValue(TreeNode root,LinkedList values,int k){
		if(root == null || values.size() == k ) return ;

		findValue(root.left,values,k);

		values.add(root.val);
		
		findValue(root.right,values,k);
	}
}
