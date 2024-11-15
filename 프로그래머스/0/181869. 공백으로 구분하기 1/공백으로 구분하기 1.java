import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        Object[] objArray = Arrays.stream(my_string.split(" ")).filter(ans -> !ans.equals("")).toArray();
        answer = Arrays.copyOf(objArray, objArray.length, String[].class);
        
        return answer;
    }
}