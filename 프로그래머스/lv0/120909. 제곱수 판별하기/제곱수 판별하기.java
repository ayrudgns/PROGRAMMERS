class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 0; i < 10000; i++) {
            if((i * i) == n) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }
        
        return answer;
    }
}