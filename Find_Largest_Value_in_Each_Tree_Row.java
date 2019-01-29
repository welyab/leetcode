// https://leetcode.com/problems/find-largest-value-in-each-tree-row/
public class Find_Largest_Value_in_Each_Tree_Row {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public java.util.List<Integer> largestValues(TreeNode root) {
		java.util.TreeMap<Integer, Integer> map = new java.util.TreeMap<>();
		find(root, 0, map);
		java.util.List<Integer> list = new java.util.ArrayList<>();
		for (java.util.Map.Entry<Integer, Integer> e : map.entrySet()) {
			list.add(e.getValue());
		}
		return list;
	}

	public void find(TreeNode root, int level, java.util.Map<Integer, Integer> map) {
		if (root == null) {
			return;
		}

		if (!map.containsKey(level) || map.get(level) < root.val) {
			map.put(level, root.val);
		}

		find(root.left, level + 1, map);
		find(root.right, level + 1, map);
	}
}
