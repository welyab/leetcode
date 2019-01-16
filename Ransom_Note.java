// https://leetcode.com/problems/ransom-note/
class Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        int memory[] = new int[26];
        char lettersMag[] = magazine.toCharArray();
        for(int i = 0; i < lettersMag.length; i++) {
            memory[(int) (lettersMag[i] - 'a')]++;
        }
        char lettersNote[] = ransomNote.toCharArray();
        for(int i = 0; i < lettersNote.length; i++) {
            if(memory[((int)lettersNote[i]-'a')] == 0) {
                return false;
            }
            memory[((int)lettersNote[i]-'a')]--;
        }
        return true;
    }
}