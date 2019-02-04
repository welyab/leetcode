// https://leetcode.com/problems/design-hashset/
class MyHashSet {

	private java.util.LinkedList<Integer>[] table;

	/** Initialize your data structure here. */
	public MyHashSet() {
		table = new java.util.LinkedList[2048];
	}

	public void add(int key) {
		if (!contains(key)) {
			getList(key).add(key);
		}
	}

	public void remove(int key) {
		java.util.Iterator<Integer> it = getList(key).iterator();
		while (it.hasNext()) {
			if (it.next() == key) {
				it.remove();
			}
		}
	}

	/** Returns true if this set contains the specified element */
	public boolean contains(int key) {
		java.util.Iterator<Integer> it = getList(key).iterator();
		while (it.hasNext()) {
			if (it.next() == key) {
				return true;
			}
		}
		return false;
	}

	private java.util.List<Integer> getList(int key) {
		int hash = getHash(key);
		if (table[hash] == null) {
			table[hash] = new java.util.LinkedList<>();
		}
		return table[hash];
	}

	private int getHash(int key) {
		return key % table.length;
	}
}

public class Design_HashSet {
}
