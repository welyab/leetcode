// https://leetcode.com/problems/asteroid-collision/
// scroll through the list until found a collision pair
// the elements are removed as specified
// the list iterator is manipulated to allow next algorithm iteration
// linked list implementation is used in order to use O(1) remove operation
public class Asteroid_Collision {

	public int[] asteroidCollision(int[] asteroids) {
		java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
		for (int i : asteroids) {
			list.add(i);
		}
		java.util.ListIterator<Integer> it = list.listIterator(0);
		while (true) {
			Integer a = null;
			if (it.hasNext()) {
				a = it.next();
			} else {
				break;
			}

			Integer b = null;
			if (it.hasNext()) {
				b = it.next();
			} else {
				break;
			}

			if (a > 0 && b < 0) {
				if (a == Math.abs(b)) {
					it.remove();
					it.previous();
					it.remove();
					if (it.hasPrevious()) {
						it.previous();
					}
				} else if (a > Math.abs(b)) {
					it.remove();
					it.previous();
				} else {
					it.previous();
					it.previous();
					it.remove();
					if (it.hasPrevious()) {
						it.previous();
					}
				}
			} else {
				it.previous();
			}
		}

		return list.stream().mapToInt(i -> i).toArray();
	}
}
