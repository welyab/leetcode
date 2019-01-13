// https://leetcode.com/problems/fibonacci-number/
public class Fibonacci_Number {
	int pd[] = new int[30];
    public int fib(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        if(pd[N-1] != 0) return pd[N-1];
        return pd[N-1] = fib(N-1) + fib(N-2);
    }
}