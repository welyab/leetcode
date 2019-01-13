// https://leetcode.com/problems/unique-morse-code-words/
public class Unique_Morse_Code_Words {
	static String dic[] = new String[]{
        ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
    };
    
    java.util.HashMap<String, String> pd = new java.util.HashMap<String, String>();
    
    public int uniqueMorseRepresentations(String[] words) {
        java.util.Set<String> set = new java.util.HashSet<>();
        for(String w : words) {
            String morsed = translate(w);
            set.add(morsed);
        }
        return set.size();
    }
    
    String translate(String w) {
        if(pd.containsKey(w)) {
            return pd.get(w);
        }
        StringBuilder b = new StringBuilder();
        for(int i =0; i<w.length(); i++) {
            b.append(dic[(int)(w.charAt(i) - 'a')]);
        }
        String x = b.toString();
        pd.put(w, x);
        return x;
    }
}