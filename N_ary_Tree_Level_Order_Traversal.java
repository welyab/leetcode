// https://leetcode.com/problems/n-ary-tree-level-order-traversal/
public class N_ary_Tree_Level_Order_Traversal{

	class Node {
		public int val;
		public java.util.List<Node> children;
	
		public Node() {}
	
		public Node(int _val,java.util.List<Node> _children) {
			val = _val;
			children = _children;
		}
	};

	public java.util.List<java.util.List<Integer>> levelOrder(Node root) {
		java.util.TreeMap<Integer, java.util.List<Integer>> map = new java.util.TreeMap<>();
		f(root, 0, map);
		return map.values().stream().map(p -> p).collect(java.util.stream.Collectors.toList());
	}

	public void f(Node n, int level, java.util.TreeMap<Integer, java.util.List<Integer>> map) {
		if (n == null) {
			return;
		}
		if (!map.containsKey(level)) {
			map.put(level, new java.util.ArrayList<>());
		}
		map.get(level).add(n.val);
		for (Node c : n.children) {
			f(c, level + 1, map);
		}
	}
}
