/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution1 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> output=new ArrayList<>();
        
        if(root!=null){
            
            output.add(root.val);
            
            output.addAll(preorderTraversal(root.left));
            
            output.addAll(preorderTraversal(root.right));
        }
        
        return output;
        
    }
}

public class Solution2{
	public List<Integer> preorderTraversal(TreeNode root){
		List<Integer> result =new ArrayList<>();

		if (root==null) {return result;}

		Stack<TreeNode> nodestack=new Stack<>();
		nodestack.push(root);

		while(!nodestack.empty()){
			TreeNode node = nodestack.pop();
			result.add(node.val);

			if (node.right!=null) {
				nodestack.push(node.rigth);
			}

			if (node.left!=null) {
				nodestack.push(node.left);
			}
		}

		return result;
	}
}