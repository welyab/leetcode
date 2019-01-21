// https://leetcode.com/problems/implement-trie-prefix-tree/
class Trie {
    
    class TrieNode {
        String word;
        TrieNode children[];
    }
    
    TrieNode root;
    
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode current = root;
        for(int i=0; i<word.length(); i++) {
			if(current.children == null) current.children = new TrieNode[26];
			int index = (int)(word.charAt(i)-'a');
			if(current.children[index] == null) current.children[index] = new TrieNode();
			current = current.children[index];
		}
		current.word = word;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
		TrieNode current = root;
		for(int i=0; i<word.length(); i++) {
			int index = (int)(word.charAt(i)-'a');
			if(current == null || current.children == null || current.children[index] == null) return false;
			current = current.children[index];
		}
		return current != null
		    && current.word != null 
		    && current.word.equals(word);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
		TrieNode current = root;
		for(int i=0; i<prefix.length(); i++) {
			int index = (int)(prefix.charAt(i)-'a');
			if(current == null || current.children == null || current.children[index] == null) return false;
			current = current.children[index];
		}
		//System.out.println(current.word + " " + java.util.Arrays.toString(current.children));
		return current != null;
    }
}

public class Implement_Trie_Prefix_Tree {
}