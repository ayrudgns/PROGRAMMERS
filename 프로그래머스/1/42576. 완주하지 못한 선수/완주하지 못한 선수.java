import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 참여자, 완주자 배열 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        // participant 배열과 completion 배열을 비교하여
        // completion 배열에 없는 값을 return하기
        for(int i = 0; i < participant.length; i++) {
            if(i <= completion.length - 1) {    
                // 미완주자가 맨 마지막에 있는 경우를 제외
                if(!participant[i].equals(completion[i])) {
                    // 참여자 배열 요소의 값과 완주자 배열 요소의 값이 다른 경우
                    answer = participant[i];
                    break;
                }
            } else {
                // 미완주자가 맨 마지막에 있는 경우
                answer = participant[participant.length - 1];
            }
        }
        
        return answer;
    }
}