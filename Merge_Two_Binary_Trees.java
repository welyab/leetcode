// https://leetcode.com/problems/merge-two-binary-trees/
public class Merge_Two_Binary_Trees {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        TreeNode m = new TreeNode(0);
        m.val = (t1 != null ? t1.val : 0)
              + (t2 != null ? t2.val : 0);
        m.left = mergeTrees(
                    t1 != null ? t1.left : null, 
                    t2 != null ? t2.left : null);
        m.right = mergeTrees(
                    t1 != null ? t1.right : null, 
                    t2 != null ? t2.right : null);
        return m;
    }
}