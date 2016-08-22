/**

Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,
   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
You should return [1, 3, 4].

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> rightSide = new LinkedList<>();

		if(root == null) return rightSide;
        
        LinkedList<TreeNode> current = new LinkedList<>();
        LinkedList<TreeNode> next    = new LinkedList<>();

        current.add(root);
        
        while(!current.isEmpty()){
            
            TreeNode node = current.remove();

            if(current.size() == 0){
                rightSide.add(node.val);
                if(node.left  != null) next.add(node.left);
                if(node.right != null) next.add(node.right);
                current = next;
                next    = new LinkedList<>();
            }else{
                if(node.left  != null) next.add(node.left);
                if(node.right != null) next.add(node.right);
            }
            
                
        }
        
		return rightSide;
    }
}
