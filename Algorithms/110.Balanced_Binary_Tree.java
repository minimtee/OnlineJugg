/**

Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        
        if(root==null || (root.left==null && root.right==null)) return true;
        
        int difference = maxDepth(root.left)-maxDepth(root.right);
        
        return ((difference<2 && difference>-2)&& isBalance(root.left) && isBalance(root.right));
        
    }
    
    private int maxDepth(TreeNode root){
        if(root == null) return 0;
        
        LinkedList<TreeNode> nodes  = new LinkedList<>();
        LinkedList<Integer>  counts = new LinkedList<>();
        
        nodes.add(root);
        counts.add(1);
        
        int max = 0;
        
        while(!nodes.isEmpty()){
            TreeNode node = nodes.remove();
            int      count= counts.remove();
            
            if(node.left==null && node.right==null && count > max){
                max = count;
            }
            
            if(node.left != null){
                nodes.add(node.left);
                counts.add(count+1);
            }
            if(node.right != null){
                nodes.add(node.right);
                counts.add(count+1);
            }
        }
        
        return max;
    }
}
