import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        // 배열을 정렬하고
        // 맨 위 2개, 맨 아래 2개 값 구하기
        // 두 값 중 큰 값 반환
        int answer = 0;
        Arrays.sort(numbers);
        int top2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int bottom2 = numbers[0] * numbers[1];
        if(top2 >= bottom2) {
            answer = top2;
        } else {
            answer = bottom2;
        }
        return answer;
    }
}