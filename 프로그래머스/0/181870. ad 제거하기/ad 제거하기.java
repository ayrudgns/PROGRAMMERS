import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        
        answer = Arrays.stream(strArr)
                    .filter(str -> !str.contains("ad"))
                    .toArray(String[]::new);
        
        return answer;
    }
}