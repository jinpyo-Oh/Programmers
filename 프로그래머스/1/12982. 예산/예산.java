import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int re = 0;
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++){
            if((budget - re) >= d[i]){
                answer++;
                re += d[i];
            }
        }
        
        return answer;
    }
}