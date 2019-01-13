// https://leetcode.com/problems/hamming-distance/
public class Hamming_Distance  {
	public int hammingDistance(int x, int y) {
        int mask = 1;
        int count = 0; 
        for(int i =0; i<32; i++) {
            if(((x & (mask << i)) ^ (y & (mask << i))) != 0) {
                count++;
            }
        }
        return count;
    }
}
