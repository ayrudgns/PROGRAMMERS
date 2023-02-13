import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // 숫자 고르기, 오름차순 정렬하기
        int[] answer = {};
        answer = arrFilterInt(my_string);
        Arrays.sort(answer);
        return answer;
    }
    
    public int[] arrFilterInt(String my_string) {
        String[] strArr = my_string.replaceAll("[^0-9]", "").split("");         // 숫자만 남기기
        int[] intArr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++) {                                // 숫자로 배열에 요소 담기
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }
}