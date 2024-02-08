class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String check = Integer.toString(x);
        int sum = 0;
        
        for (int i = 0; i < check.length(); i++) {
            char digit = check.charAt(i);
            sum += Character.getNumericValue(digit); 
        }
        
        return (x % sum == 0) ? answer : !answer;
       
    }
}