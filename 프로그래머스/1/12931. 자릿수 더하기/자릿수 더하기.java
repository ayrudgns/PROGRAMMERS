import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nString = String.valueOf(n);
        for(int i = 0; i < nString.length(); i++) {
            answer += Integer.parseInt(nString.substring(i, i + 1));
        }
        return answer;
    }
}