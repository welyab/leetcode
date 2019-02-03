// https://leetcode.com/problems/increasing-order-search-tree/
public class Increasing_Order_Search_Tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode increasingBST(TreeNode root) {
		if (root == null) {
			return null;
		}
		java.util.List<Integer> list = new java.util.ArrayList<>();
		fillList(root, list);
		// list.sort((v1, v2) -> v1 - v2);

		TreeNode tree = null;
		TreeNode current = null;
		for (int i : list) {
			if (current == null) {
				tree = new TreeNode(i);
				current = tree;
			} else {
				current.right = new TreeNode(i);
				current = current.right;
			}
		}

		return tree;
	}

	private void fillList(TreeNode root, java.util.List<Integer> list) {
		if (root == null) {
			return;
		}
		fillList(root.left, list);
		list.add(root.val);
		fillList(root.right, list);
	}
}
