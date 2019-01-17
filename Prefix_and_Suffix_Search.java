// https://leetcode.com/problems/prefix-and-suffix-search/
class WordFilter {

	static class TrieNode {
		String word;
		int  weight;
		TrieNode children[];
	}

	TrieNode rootPrefix = new TrieNode();
	TrieNode rootSuffix = new TrieNode();

	public void insertWord(String word, int weight) {
		char chars[] = word.toCharArray();
		TrieNode current = rootPrefix;
		for(int i =0; i<chars.length; i++) {
			if(current.children == null) current.children = new TrieNode[26];
			int index = (int)(chars[i]-'a');
			if(current.children[index] == null) current.children[index] = new TrieNode();
			current = current.children[index];
		}
		current.weight = weight;
		current.word = word;
		current = rootSuffix;
		for(int i = chars.length-1; i>=0; i--) {
			if(current.children == null) current.children = new TrieNode[26];
			int index = (int)(chars[i]-'a');
			if(current.children[index] == null) current.children[index] = new TrieNode();
			current = current.children[index];
		}
		current.weight = weight;
		current.word = word;
	}

	public java.util.List<TrieNode> search(String w, boolean prefix) {
		char chars[] = prefix ? w.toCharArray() : new StringBuilder(w).reverse().toString().toCharArray();
		TrieNode current = prefix ? rootPrefix : rootSuffix;
		for(int i =0; i<chars.length; i++) {
			if(current == null) return new java.util.ArrayList<>();
			current = current.children[(int)(chars[i]-'a')];
		}
		java.util.List<TrieNode> list = new java.util.ArrayList<>();
		walk(current, list);
		return list;
	}

	public void walk(TrieNode root, java.util.List<TrieNode> list) {
		if(root == null) {return;}
		if(root.word != null) list.add(root);
		if(root.children != null) for(TrieNode node : root.children) walk(node, list);
	}

	public WordFilter(String[] words) {
		for(int i =0; i<words.length; i++) insertWord(words[i], i);
	}

	public int f(String prefix, String suffix) {
		java.util.List<TrieNode> prefixes = search(prefix, true);
		java.util.List<TrieNode> suffixes = search(suffix, false);

		prefixes.removeIf(t -> !t.word.endsWith(suffix));
		suffixes.removeIf(t -> !t.word.startsWith(prefix));

		if(prefixes.isEmpty() || suffixes.isEmpty()) {
			return -1;
		}

		return java.util.stream.Stream
				.concat(prefixes.stream(), suffixes.stream())
				.sorted((s1, s2) -> s2.weight - s1.weight)
				.findFirst()
				.map(w -> w.weight)
				.orElse(-1);
	}
}

public class Prefix_and_Suffix_Search {
	// solution in the WordFilter class
}
