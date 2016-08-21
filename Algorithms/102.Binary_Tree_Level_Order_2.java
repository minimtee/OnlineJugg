/**

Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>  result = new ArrayList<>();
        Stack<List<Integer>> stack  = new Stack<>();
        List<Integer>        level  = new ArrayList<>();
        
        if(root == null) return result;
        
        LinkedList<TreeNode> current = new LinkedList<>();
        LinkedList<TreeNode> next    = new LinkedList<>();
        
        current.add(root);
        
        while(!current.isEmpty()){
            TreeNode node = current.remove();
            
            if(node.left != null) next.add(node.left);
            if(node.right != null) next.add(node.right);
            
            level.add(node.val);
            
            if(current.isEmpty()){
                current = next;
                stack.add(level);
                next  = new LinkedList<>();
                level = new ArrayList<>();
            }
        }
        
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        
        return result;
    }
}
