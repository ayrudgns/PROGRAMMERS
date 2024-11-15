import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        // 문자열을 공백 기준으로 쪼개어 배열로 만든 후, 공백이 아닌 요소만 filter 처리하여 배열로 반환
        Object[] objArray = Arrays.stream(my_string.split(" ")).filter(ans -> !ans.equals("")).toArray();
        // 반환된 배열을 String[] 타입으로 변경
        answer = Arrays.copyOf(objArray, objArray.length, String[].class);
        
        return answer;
    }
}