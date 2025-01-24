import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        int[] sortedNumList = Arrays.stream(num_list).sorted().toArray();
        
        for(int i = 5; i < sortedNumList.length; i++) {
            answer[i - 5] = sortedNumList[i];
        }
        
        return answer;
    }
}