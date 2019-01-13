public class N_ary_Tree_Postorder_Traversal {
	
	class Node {
		public int val;
		public java.util.List<Node> children;
	
		public Node() {}
	
		public Node(int _val,java.util.List<Node> _children) {
			val = _val;
			children = _children;
		}
	};

	public java.util.List<Integer> postorder(Node root) {
        java.util.List<Integer> l = new java.util.ArrayList<>();
        f(root, l);
        return l;
    }
    
    void f(Node r, java.util.List<Integer> l) {
        if(r == null) return;
        for(Node n : r.children) f(n, l);
        l.add(r.val);
    }
}