// https://leetcode.com/problems/power-of-two/
public class Power_of_Two {
	public boolean isPowerOfTwo(int n) {
        while(n>1&&n%2==0) n/=2;
		return n==1;
    }
}