// https://leetcode.com/problems/design-hashmap/
class MyHashMap {

	private class Node {
		int key;
		int value;

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	private java.util.LinkedList<Node>[] table;

	/** Initialize your data structure here. */
	public MyHashMap() {
		table = new java.util.LinkedList[8192];
	}

	/** value will always be non-negative. */
	public void put(int key, int value) {
		java.util.LinkedList<Node> list = getList(key);
		java.util.Iterator<Node> it = list.iterator();
		while (it.hasNext()) {
			Node node = it.next();
			if (node.key == key) {
				node.value = value;
				return;
			}
		}
		list.add(new Node(key, value));
	}

	/**
	 * Returns the value to which the specified key is mapped, or -1 if this map
	 * contains no mapping for the key
	 */
	public int get(int key) {
		java.util.Iterator<Node> it = getList(key).iterator();
		while (it.hasNext()) {
			Node node = it.next();
			if (node.key == key) {
				return node.value;
			}
		}
		return -1;
	}

	/**
	 * Removes the mapping of the specified value key if this map contains a
	 * mapping for the key
	 */
	public void remove(int key) {
		java.util.Iterator<Node> it = getList(key).iterator();
		while (it.hasNext()) {
			if (it.next().key == key) {
				it.remove();
			}
		}
	}

	private java.util.LinkedList<Node> getList(int key) {
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

public class Design_HashMap {

}
