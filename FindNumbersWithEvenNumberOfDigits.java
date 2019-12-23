// https://leetcode.com/problems/find-numbers-with-even-number-of-digits
class Solution {
    public int findNumbers(int[] nums) {
        int evens = 0;
        for(int i : nums) {
            int digits = 0;
            while(i!=0) {
                i /= 10;
                digits++;
            }
            if(digits % 2 == 0) evens++;
        }
        return evens;
    }
}
