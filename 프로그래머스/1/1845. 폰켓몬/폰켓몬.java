import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int tempAnswer = Arrays.stream(nums).distinct().toArray().length;
        
        return (nums.length / 2) < tempAnswer ? (nums.length / 2) : tempAnswer;
    }
}