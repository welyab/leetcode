// https://leetcode.com/problems/robot-return-to-origin/
public class Robot_Return_to_Origin {
	public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(int i =0; i<moves.length(); i++) {
            char m = moves.charAt(i);
            if(m == 'U') y++;
            if(m == 'D') y--;
            if(m == 'L') x--;
            if(m == 'R') x++;
        }
        return x == 0 && y == 0;
    }	
}