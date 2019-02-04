// https://leetcode.com/problems/validate-binary-search-tree/
public class Validate_Binary_Search_Tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isValidBST(TreeNode root) {
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean checkBST(TreeNode root, long min, long max) {
		if (root == null) {
			return true;
		}
		if (root.val < min || root.val > max) {
			return false;
		}
		return checkBST(root.left, min, root.val - 1L)
			&& checkBST(root.right, root.val + 1L, max);
	}
}
