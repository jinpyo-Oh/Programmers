class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        StringBuilder ss = new StringBuilder(phone_number);
        
        for(int i = 0; i < ss.length() - 4; i++){
            ss.setCharAt(i, '*');
        }
        
        answer = ss.toString();
        
        return answer;
    }
}