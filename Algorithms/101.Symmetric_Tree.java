/**

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3


 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        ArrayList<String> level = new ArrayList<>();
        
        if(root == null) return true;
        
        LinkedList<TreeNode> current = new LinkedList<>();
        LinkedList<TreeNode> next    = new LinkedList<>();
        
        current.add(root);
        
        //if we have elements in current queue!
        while(!current.isEmpty()){
            //get element from current queue
            TreeNode node = current.remove();
            //push child tree into next queue
            if(node.left != null) {
                next.add(node.left);   
            }
            if(node.right != null){
                next.add(node.right);
            }
            //add the element into the level array
            level.add(node.val.toString());
            
            //if current level is run out 
            //1. move element from next to current
            //2. judge whether the tree is symmertirc
            if(current.isEmpty()){
                //move element from next to current and update next array;
                current = next;
                next  = new LinkedList<>();
                
                //judge if symmertric
                int len = level.size();
                for(int i = 0;i<len/2+1;i++){
                    if(!level.get(i).equals(level.get(len-i-1))) 
                    return false;
                }
                level = new ArrayList<>();
            }
        }
        
        //if we run out of element
        return true;
    }
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSame(root.left,root.right);
    }
    
    private boolean isSame(TreeNode left ,TreeNode right){
        if(left == null && right == null) return true;
        
        if((left==null && right!=null)||(left!=null && right==null)) return false;
        
        return (left.val == right.val)&&isSame(left.left,right.right)&&isSame(left.right,right.left);
    }
}
