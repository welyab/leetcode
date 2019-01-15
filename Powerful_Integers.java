// https://leetcode.com/problems/powerful-integers/
public class  Powerful_Integers {

	public java.util.List<Integer> powerfulIntegers(int x, int y, int bound) {
		int maxi = 0;
        while(x > 1 && ((int) Math.pow(x, maxi)) <= bound) maxi++;
        int maxj = 0;
        while(y > 1 && ((int) Math.pow(y, maxj)) <= bound) maxj++;
		java.util.Set<Integer> set = new java.util.HashSet<Integer>();
		//System.out.printf("%d %d%n", maxi, maxj);
        for(int i = 0; i <= maxi; i++) {
            for(int j = 0; j <= maxj; j++) {
				int p = (int)(Math.pow(x, i) + Math.pow(y, j));
				//System.out.printf("p = %d%n", p);
                if(p <= bound) {
                    set.add(p);
                }else{
                    break;
                }
            }
        }
        return new java.util.ArrayList<>(set);
	}
}