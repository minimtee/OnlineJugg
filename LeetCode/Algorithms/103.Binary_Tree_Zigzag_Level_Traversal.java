/**

Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result      = new LinkedList<>();
        List<Integer>       levelQueue  = new LinkedList<>();
        Stack<Integer>      levelStack  = new Stack<>();
        
        if(root == null) return result;
        
        LinkedList<TreeNode> current = new LinkedList<>();
        LinkedList<TreeNode> next    = new LinkedList<>();
        
        boolean leftToRight = true;
        
        current.add(root);
        
        while(!current.isEmpty()){
            
            TreeNode node = current.remove();

            if(node.left  != null) next.add(node.left);
            if(node.right != null) next.add(node.right);
            
            if(leftToRight){
                levelQueue.add(node.val);
            }else{
                levelStack.add(node.val);
            }
            
            if(current.isEmpty()){
                current = next; 
                next  = new LinkedList<>();
 
                if(leftToRight){
                    result.add(levelQueue);
                    levelQueue = new LinkedList<>();
                }else{
                    while(!levelStack.isEmpty()) 
                        levelQueue.add(levelStack.pop());
                    result.add(levelQueue);
                    levelQueue = new LinkedList<>();
                    levelStack = new Stack<>();
                }
                
                leftToRight = (leftToRight)?false:true;
            }
                
        }
        
        return result;
    }
}
