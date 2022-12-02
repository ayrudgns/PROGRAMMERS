import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;        
        Arrays.sort(numbers);
        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2]; 
        return answer;
    }
}
// import 없는 
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max2) {
                if(numbers[i] > max1) {
                    max1 = numbers[i];
                    max2 = numbers[i - 1];
                } else {
                    max2 = numbers[i];
                }
            }
        }
        answer = max1 * max2;
        return answer;
    }
}
