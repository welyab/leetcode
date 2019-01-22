// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
public class Minimum_Add_to_Make_Parentheses_Valid {
	public int minAddToMakeValid(String S) {
		int stack = 0;
		int count = 0;
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i) == '(') stack++;
			else if(S.charAt(i) == ')') {
				if(stack == 0) count++;
				else stack--;
			}
		}
		return count + stack;
    }
}
