class Solution {
    public int solution(int hp) {
        int answer = 0;     // 최소한의 병력
        // 장군 5, 병정 3, 일 1
        answer += hp / 5;
        hp = hp % 5;
        answer += hp / 3;
        hp = hp % 3;
        answer += hp / 1;
        return answer;
    }
}