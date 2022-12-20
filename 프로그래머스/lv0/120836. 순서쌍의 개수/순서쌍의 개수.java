class Solution {
    public int solution(int n) {
        int answer = 0;
        // 결국 약수를 구하면 된다.
        int cnt = 0;
        for(int i = 1; i <= 1000000; i++) {
            if(n % i == 0) {
                cnt++;
            }
        }
        answer = cnt;
        return answer;
    }
}