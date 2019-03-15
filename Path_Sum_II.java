// https://leetcode.com/problems/path-sum-ii/submissions/
public class Path_Sum_II {
	
	  public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
	
	public java.util.List<java.util.List<Integer>> pathSum(TreeNode root, int sum) {
		java.util.List<java.util.List<Integer>> paths = new java.util.ArrayList<>();
        paths(root, new java.util.ArrayList<>(), paths, sum);
        return paths;
    }
    
    private void paths(TreeNode root, java.util.List<Integer> current, java.util.List<java.util.List<Integer>> paths, int sum) {
        if(root == null) return;
        current.add(root.val);
        if(root.left == null && root.right == null && root.val == sum) {
            paths.add(new java.util.ArrayList<>(current));
        }
        paths(root.left, current, paths, sum-root.val);
        paths(root.right, current, paths, sum-root.val);
        current.remove(current.size() - 1);
    }
}
