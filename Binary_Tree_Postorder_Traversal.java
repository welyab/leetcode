// https://leetcode.com/problems/binary-tree-postorder-traversal/
public class Binary_Tree_Postorder_Traversal {
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}

	public java.util.List<Integer> postorderTraversal(TreeNode root) {
        return postorderTraversal(root, new java.util.ArrayList<>());
    }
    
    public java.util.List<Integer> postorderTraversal(TreeNode root, java.util.List<Integer> list) {
        if(root == null) return list;
        postorderTraversal(root.left, list);
        postorderTraversal(root.right, list);
        list.add(root.val);
        return list;
    }
}