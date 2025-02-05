import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String nString = String.valueOf(n);
        String[] nArr = new String[nString.length()];
        
        for(int i = 0; i < nString.length(); i++) {
            nArr[i] = nString.substring(i, i + 1);
        }
        
        Arrays.sort(nArr, (a, b) -> Integer.parseInt(b) - Integer.parseInt(a));
        
        String sortedString = String.join("", nArr);
        
        answer = Long.parseLong(sortedString);
        
        return answer;
    }
}