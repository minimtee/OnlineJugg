/**

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        LinkedList<TreeNode> nodes  = new LinkedList<>();
        LinkedList<Integer>  counts = new LinkedList<>();
        
        nodes.add(root);
        counts.add(1);
        
        int max = 0;
        
        while(!nodes.isEmpty()){
            TreeNode current = nodes.remove();
            int      count   = counts.remove();
            
            if(current.left==null && current.right==null && count>max){
                max = count;
            }
            
            if(current.left != null){
                nodes.add(current.left);
                counts.add(count+1);
            }
            if(current.right != null){
                nodes.add(current.right);
                counts.add(count+1);
            }
        }
        
        return max;
    }
}
