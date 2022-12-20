class Solution {
    public int solution(int n) {
        int answer = 0;
        // 인자 받고, 자릿수 check, 그만큼 반복
        int tmp = n;        // 인자 받음
        
        while(tmp > 0) {
            answer += tmp % 10;
            tmp = tmp / 10;
        }
        return answer;
    }
}