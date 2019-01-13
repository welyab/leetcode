// https://leetcode.com/problems/search-in-a-binary-search-tree/
public class Search_in_a_Binary_Search_Tree {
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }

	public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;
        if(root.val < val) return searchBST(root.right, val);
        return searchBST(root.left, val);
    }
}