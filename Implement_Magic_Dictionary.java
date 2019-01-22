class MagicDictionary {

	class TrieNode {

		String word;

		TrieNode children[];
	}

	TrieNode root;

	/** Initialize your data structure here. */
	public MagicDictionary() {
		root = new TrieNode();
	}

	/** Build a dictionary through a list of words */
	public void buildDict(String[] dict) {
		for (String w : dict) {
			TrieNode current = root;
			for (int i = 0; i < w.length(); i++) {
				if (current.children == null) {
					current.children = new TrieNode[26];
				}
				int index = w.charAt(i) - 'a';
				if (current.children[index] == null) {
					current.children[index] = new TrieNode();
				}
				current = current.children[index];
			}
			current.word = w;
		}
	}

	/**
	 * Returns if there is any word in the trie that equals to the given word after modifying
	 * exactly one character
	 */
	public boolean search(String word) {
		return search(root, word.toCharArray(), 0, false);
	}

	public boolean search(TrieNode root, char word[], int index, boolean change) {
		if(root == null || root.children == null) return false;
	}
}

public class Implement_Magic_Dictionary {

	public static void main(String args[]) {
		MagicDictionary magic = new MagicDictionary();
		magic.buildDict(new String[]{"hello", "leetcode"});
		System.out.println(magic.search("hello"));
		System.out.println(magic.search("hhllo"));
		System.out.println(magic.search("hell"));
		System.out.println(magic.search("leetcoded"));
	}
}
