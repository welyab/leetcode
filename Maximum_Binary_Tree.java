// https://leetcode.com/problems/maximum-binary-tree/
public class Maximum_Binary_Tree  {

	 public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public TreeNode constructMaximumBinaryTree(int[] nums) {
        return c(nums, 0, nums.length-1);
    }
    
    TreeNode c(int[] nums, int a, int b) {
        if(b<a) return null;
        if(a == b) {
            return new TreeNode(nums[a]);
        }
        int max = nums[a];
        int index = a;
        for(int i=a; i<=b; i++)  {
            if(max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode n = new TreeNode(nums[index]);
        n.left = c(nums, a, index-1);
        n.right = c(nums, index+1, b);
        return n;
    }
}