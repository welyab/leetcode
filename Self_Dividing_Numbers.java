// https://leetcode.com/problems/self-dividing-numbers/
public class Self_Dividing_Numbers {

	public java.util.List<Integer> selfDividingNumbers(int left, int right) {
		java.util.List<Integer> list = new java.util.ArrayList<>();
		for(int i = left; i<=right; i++) {
			int x = i;
			boolean selfDiv = true;
			while(x != 0) {
				if(x % 10 == 0) {
					selfDiv = false;
					break;
				}
				if(i % (x % 10) != 0) {
					selfDiv = false;
					break;
				}
				x = x /10;
			}
			if(selfDiv) {
				list.add(i);
			}
		}
		return list;
	}
}
