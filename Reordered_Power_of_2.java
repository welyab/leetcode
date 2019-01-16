// https://leetcode.com/problems/reordered-power-of-2/
public class Reordered_Power_of_2 {
	public boolean reorderedPowerOf2(int N) {
		char digits[] = Integer.toString(N).toCharArray();
		boolean memory[] = new boolean[digits.length];
    }
    
    public boolean isPowerOfTwo(int n) {
        while(n>1&&n%2==0) n/=2;
		return n==1;
	}
	
	public static void main(String [] args) {
		Reordered_Power_of_2 p = new Reordered_Power_of_2();
		System.out.println(p.reorderedPowerOf2(24));
	}
}