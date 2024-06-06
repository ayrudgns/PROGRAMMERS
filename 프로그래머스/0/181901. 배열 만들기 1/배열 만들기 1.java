class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        return this.createArray(n, k);
    }
    
    public int[] createArray(int limits, int multipleValue) {
        int[] answer = new int[limits / multipleValue];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = multipleValue * (i + 1);
        }
        
        return answer;
    }
}