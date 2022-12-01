class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 1) {        // 홀수이면
            n = n - 1;          // 1 작은 짝수로 만들고
        }
        for(int i = n; i >= 0; i -= 2) {
                answer += i;
            }
        return answer;
    }
}
