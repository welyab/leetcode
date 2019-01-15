// https://leetcode.com/problems/k-closest-points-to-origin/
public class K_Closest_Points_to_Origin {
	public int[][] kClosest(int[][] points, int K) {
        class T {int x, y; double d; T(int x1, int y1, double d1) {x=x1; y=y1; d=d1;}}
        java.util.List<T> list = new java.util.ArrayList<>();
        for(int i=0; i<points.length; i++) {
            double distance = Math.sqrt(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2)) * 1000;
            list.add(new T(points[i][0], points[i][1], distance));
        }
        list = list.stream().sorted((t1,t2)->(int)(t1.d-t2.d)).collect(java.util.stream.Collectors.toList());
        int resp[][] = new int[K][2];
        for(int i=0; i<K; i++) {
            resp[i][0] = list.get(i).x;
            resp[i][1] = list.get(i).y;
        }
        return resp;
    }
}