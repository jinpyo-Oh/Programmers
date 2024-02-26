class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length()==4 || s.length() ==6){
            
            int a = 0;
            for(int i = 0; i < s.length(); i++){
                if(!Character.isDigit(s.charAt(i))){
                    break;
                }
                a++;
            }
            if(a == s.length()){
                answer = true;
            }
        }
        return answer;
    }
}