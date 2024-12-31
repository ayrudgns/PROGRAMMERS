import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        // BigInteger 클래스: 문자열로 숫자를 생성하므로 매우 큰 정수를 처리할 수 있는 클래스
        BigInteger aBigInteger = new BigInteger(a);
        BigInteger bBigInteger = new BigInteger(b);
        
        answer = String.valueOf(aBigInteger.add(bBigInteger));
        
        return answer;
    }
}