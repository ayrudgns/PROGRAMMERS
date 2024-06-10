import java.util.Arrays;

class Solution {
    public int solution(String number) {
        // ex) 142 % 9 = 7 = 1 + 4 + 2
        return this.caculateRemainder(number);
    }
    
    public int caculateRemainder(String numberString) {
        int answer = 0;
        int[] numberArray = new int[numberString.length()];
        
        // 문자열을 숫자로 바꾸어 한자리씩 배열에 담는다.
        for(int i = 0; i < numberString.length(); i++) {
            String tempNumberString = numberString.substring(i, i + 1);
            numberArray[i] = Integer.parseInt(tempNumberString);
        }
        
        // 배열의 값을 총합하여 9로 나누어 나머지를 return 한다.
        answer = (Arrays.stream(numberArray).sum()) % 9;
        
        return answer;
    }
}