/**
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer>       level  = new ArrayList<>();
        
        if(root == null) return result;
        
        LinkedList<TreeNode> current = new LinkedList<>();
        LinkedList<TreeNode> next    = new LinkedList<>();
        
        current.add(root);
        
        while(!current.isEmpty()){
            TreeNode node = current.remove();
            
            if(node.left != null) next.add(node.left);
            if(node.right!= null) next.add(node.right);
            
            //add the value of node into level link
            level.add(node.val);
            
            if(current.isEmpty()){
                current = next;
                result.add(level);
                next  = new LinkedList<>();
                level = new ArrayList<>();
            }
        }
        
        return result;
    }
}
