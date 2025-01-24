import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> yaksuList = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                yaksuList.add(i);
            }
        }
        
        int[] answer = yaksuList.stream()
                        .mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}