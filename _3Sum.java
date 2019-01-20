// https://leetcode.com/problems/3sum/
public class _3Sum {

	public java.util.List<java.util.List<Integer>> threeSum(int[] nums) {
        java.util.Arrays.sort(nums);
        class Triple {int a, b, c; Triple(int _a, int _b, int _c){a=_a;b=_b; c=_c;}}
        java.util.TreeSet<Triple> set = new java.util.TreeSet<>((t1, t2) -> 
                        t1.a != t2.a 
                            ? t1.a - t2.a
                            : t1.b != t2.b
                                ? t1.b - t2.b
                                : t1.c - t2.c
        );
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i-1] == nums[i]) continue;
            if(nums[i] > 0) break;
            for(int j = i + 1; j < nums.length; j++) {
                if(j > i + 1 && nums[j-1] == nums[j]) continue;
                if(nums[i] + nums[j] > 0) break;
                for(int k = j + 1; k < nums.length; k++) {
                    int s = nums[i] + nums[j] + nums[k];
                    if(s > 0) break;
                    if(s == 0) {
                        Triple t = new Triple(nums[i], nums[j], nums[k]);
                        if(!set.contains(t)) {
                            java.util.List<Integer> list = new java.util.ArrayList<>();
                            list.add(t.a);
                            list.add(t.b);
                            list.add(t.c);
                            result.add(list);
                            set.add(t);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        new _3Sum().threeSum(new int[]{
            -4, -1, -1, 0, 1, 2
        }).forEach(System.out::println);
    }
}
