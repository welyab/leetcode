// https://leetcode.com/problems/range-sum-of-bst/
public class Range_Sum_of_BST {

	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}

	public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) return 0;
        return (root.val >= L && root.val <= R ? root.val : 0)
             + rangeSumBST(root.left, L, R)
             + rangeSumBST(root.right, L, R);
    }
}