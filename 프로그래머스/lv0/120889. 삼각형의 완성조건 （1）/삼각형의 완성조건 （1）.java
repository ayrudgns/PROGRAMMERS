class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int temp = 0;
        for(int i = 0; i < sides.length - 1; i++) {     // 정렬 먼저
            if(sides[i + 1] < sides[i]) {
                temp = sides[i + 1];
                sides[i + 1] = sides[i];
                sides[i] = temp;
            }
        }
        if(sides[0] + sides[1] > sides[2]) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}