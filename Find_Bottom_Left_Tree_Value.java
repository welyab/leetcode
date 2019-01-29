// https://leetcode.com/problems/find-bottom-left-tree-value/
public class Find_Bottom_Left_Tree_Value {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int findBottomLeftValue(TreeNode root) {
		return find(root, 0).value;
	}

	private ValuedLevel find(TreeNode root, int level) {
		if (root == null) {
			return null;
		}
		ValuedLevel v = new ValuedLevel(root.val, level);
		ValuedLevel vl = find(root.left, level + 1);
		ValuedLevel vr = find(root.right, level + 1);
		if (vl != null && vr != null) {
			if (vl.level >= vr.level) {
				return vl;
			} else {
				return vr;
			}
		} else if (vl != null && vr == null) {
			return vl;
		} else if (vl == null && vr != null) {
			return vr;
		} else {
			return v;
		}
	}

	private class ValuedLevel {
		int value, level;

		ValuedLevel(int a, int b) {
			this.value = a;
			this.level = b;
		}
	}
}
