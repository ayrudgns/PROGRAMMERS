class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 2 == 0) {
            // n이 짝수인 경우: ex) 8인 경우
            for(int i = 1; i <= (n / 2); i++) {
                answer += i * i * 4;
            }
        } else {
            // n이 홀수인 경우: ex) 9인 경우
            for(int i = 0; i < ((n / 2) + 1); i++) {
                answer += (2 * i) + 1;
            }
        }
        
        return answer;
    }
}