public class Binary_Tree_Inorder_Traversal {

	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}

	public java.util.List<Integer> inorderTraversal(TreeNode root) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        inorderTraversal(root, list);
        return list;
    }
    
    public void inorderTraversal(TreeNode root, java.util.List<Integer> list) {
        if(root == null) return;
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }
}