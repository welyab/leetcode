// https://leetcode.com/problems/map-sum-pairs/

class MapSum {
	
	class TrieNode {
		
		private String word;
		
		private int val;
		
		private TrieNode[] children;
	}
	
	TrieNode root;
	
	/** Initialize your data structure here. */
	public MapSum() {
		root = new TrieNode();
	}
	
	public void insert(String key, int val) {
		TrieNode current = root;
		for (int i = 0; i < key.length(); i++) {
			if(current.children == null) current.children = new TrieNode[26];
			int index = (int)(key.charAt(i)-'a');
			if(current.children[index] == null) current.children[index] = new TrieNode();
			current = current.children[index];
		}
		current.word = key;
		current.val = val;
	}
	
	public int sum(String prefix) {
		TrieNode current = root;
		for (int i = 0; i < prefix.length() && current != null; i++) {
			if(current.children == null) current.children = new TrieNode[26];
			int index = (int)(prefix.charAt(i)-'a');
			current = current.children[index];
		}
		return sum(current);
	}
	
	int sum(TrieNode root) {
		int s = 0;
		if (root == null || root.word == null) s = 0;
		else s = root.val;
		if (root != null && root.children != null) {
			for (TrieNode n : root.children) {
				s += sum(n);
			}
		}
		return s;
	}
}

public class Map_Sum_Pairs {
}
