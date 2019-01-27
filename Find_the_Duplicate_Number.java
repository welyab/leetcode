// https://leetcode.com/problems/find-the-duplicate-number/
public class Find_the_Duplicate_Number {
	public int findDuplicate(int[] nums) {
		java.util.HashSet<Integer> set = new java.util.HashSet<>();
		for (int n : nums) {
			if (set.contains(n)) {
				return n;
			}
			set.add(n);
		}
		return 0;
	}
}
