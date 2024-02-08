class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int yc = 0;
        int pc = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i)); 
            if (ch == 'y') {
                yc++;
            } else if (ch == 'p') {
                pc++;
            }
        }
        
        if(pc == yc) {
            return answer;
        } else {
            return !answer;
        }
        
       
    }
}