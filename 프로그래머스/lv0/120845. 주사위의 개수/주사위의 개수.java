class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        // box 배열은 가, 세, 높
        // max = (가로 / n) * (세로 / n) * (높이 / n)
        
        answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        
        return answer;
    }
}