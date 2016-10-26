/**

Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    //返回值
    private List<String> result; 
    
    //主函数
    public List<String> binaryTreePaths(TreeNode root) {
        
        result = new ArrayList<>();
        
        //如果给null就直接返回空值
        if(root == null) return result;
        //如果是子叶就返回本身值
        if(root.left==null && root.right ==null){
            result.add(String.valueOf(root.val));
        }else{//一般情况
            if(root.left != null){
                traverse(root.left,String.valueOf(root.val));//传递根值
            }
            if(root.right!= null){
                traverse(root.right,String.valueOf(root.val));//传递根值
            }
        }
        
        return result;
    }
    
    //递归遍历 可以用返回void的函数来直接操控list
    private void traverse(TreeNode node,String s){
        
        if(node.left==null && node.right==null){//the leaf node
            result.add(s+"->"+node.val);
            return;
        }else{
            if(node.left != null) traverse(node.left,s+"->"+node.val);
            if(node.right!= null) traverse(node.right,s+"->"+node.val);
        }
    }
}
