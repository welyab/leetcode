// https://leetcode.com/problems/path-sum-iii/
public class Path_Sum_III {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int pathSum(TreeNode root, int sum) {
		if (root == null) {
			return 0;
		}
		int s = 0;
		java.util.Stack<TreeNode> stack = new java.util.Stack();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			s += paths(node, 0, sum);
			if (node.left != null)
				stack.push(node.left);
			if (node.right != null)
				stack.push(node.right);
		}
		return s;
	}

	private int paths(TreeNode root, int current, int sum) {
		if (root == null)
			return 0;
		int s = 0;
		if (root.val + current == sum) {
			s = 1;
		}
		return paths(root.left, root.val + current, sum)
			+ paths(root.right, root.val + current, sum)
			+ s;
	}
}
