import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int tempAnswer = Arrays.stream(nums).distinct().toArray().length;

        if((nums.length / 2) < tempAnswer) {
            answer = (nums.length / 2);
        } else {
            answer = tempAnswer;
        }
        
        return answer;
    }
}