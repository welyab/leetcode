public class Leaf_Similar_Trees {

	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}

	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return f(root1, new java.util.ArrayList<>()).equals(f(root2, new java.util.ArrayList<>()));
    }
    
    java.util.List<Integer> f(TreeNode r, java.util.List<Integer> l) {
        if(r == null) return l;
        if(r.left == null && r.right == null) {l.add(r.val); return l;}
        f(r.left, l);
        f(r.right, l);
        return l;
    }
}