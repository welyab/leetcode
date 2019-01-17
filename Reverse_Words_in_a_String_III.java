// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class Reverse_Words_in_a_String_III {
	public String reverseWords(String s) {
        return java.util.Arrays.stream(s.split(" "))
            .map(w -> new StringBuilder(w).reverse())
            .reduce((w1, w2) -> w1.append(" ").append(w2))
            .map(w -> w.toString())
            .get();
    }
}