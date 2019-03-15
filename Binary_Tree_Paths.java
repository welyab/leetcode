// https://leetcode.com/problems/binary-tree-paths/
public class Binary_Tree_Paths {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public java.util.List<String> binaryTreePaths(TreeNode root) {
		java.util.List<String> list = new java.util.ArrayList<>();
		paths(root, "", list);
		return list;
	}

	private void paths(TreeNode root, String current, java.util.List<String> list) {
		if (root == null)
			return;
		current += current.isEmpty() ? "" + root.val : "->" + root.val;
		if (root.left == null && root.right == null) {
			list.add(current);
			return;
		}
		paths(root.left, current, list);
		paths(root.right, current, list);
	}
}
