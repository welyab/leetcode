// https://leetcode.com/problems/find-mode-in-binary-search-tree/
public class Find_Mode_in_Binary_Search_Tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int[] findMode(TreeNode root) {
		java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
		count(root, map);
		int max = 0;
		java.util.List<Integer> list = new java.util.ArrayList<>();
		for (java.util.Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > max) {
				list.clear();
				max = e.getValue();
			}
			if (max == e.getValue()) {
				list.add(e.getKey());
			}
		}
		int[] v = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			v[i] = list.get(i);
		}
		return v;
	}

	public void count(TreeNode root, java.util.Map<Integer, Integer> map) {
		if (root == null) {
			return;
		}
		map.put(root.val, map.getOrDefault(root.val, 0) + 1);
		count(root.left, map);
		count(root.right, map);
	}
}
