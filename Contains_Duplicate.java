// https://leetcode.com/problems/contains-duplicate/
public class Contains_Duplicate {
	public boolean containsDuplicate(int[] nums) {
		java.util.HashSet<Integer> set = new java.util.HashSet<>();
		for (int n : nums) {
			if (set.contains(n)) {
				return true;
			}
			set.add(n);
		}
		return false;
	}
}
