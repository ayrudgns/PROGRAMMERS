import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int minimumInArray = Arrays.stream(arr).min().getAsInt();
        
        answer = Arrays.stream(arr).filter(item -> item != minimumInArray).toArray();
        
        if(answer.length <= 0) {
            // -1 추가
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}