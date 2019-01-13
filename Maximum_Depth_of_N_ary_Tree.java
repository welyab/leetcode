// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
public class Maximum_Depth_of_N_ary_Tree {
	class Node {
		public int val;
		public java.util.List<Node> children;
	
		public Node() {}
	
		public Node(int _val,java.util.List<Node> _children) {
			val = _val;
			children = _children;
		}
	};

	public int maxDepth(Node root) {
        return f(root, 1);
    }
    
    int f(Node r, int d) {
        if(r == null) return 0;
        int max = 0;
        for(Node n : r.children)
            max = Math.max(max, 1 + f(n, 0));
        return d + max;
    }
}