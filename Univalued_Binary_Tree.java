// https://leetcode.com/problems/univalued-binary-tree/
public class Univalued_Binary_Tree {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

    public boolean isUnivalTree(TreeNode root) {
        java.util.Stack<TreeNode> s = new java.util.Stack<>();
        s.push(root);
        while(!s.isEmpty()) {
            TreeNode n = s.pop();
            if(n.val != root.val)
                return false;
            if(n.left != null)  s.push(n.left);
            if(n.right != null) s.push(n.right);
        }
        return true;
    }
}