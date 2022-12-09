class Solution {
    public int[] solution(int n) {
        int len = 0;
        if(n % 2 == 1) {
            len = (n / 2) + 1;
        } else {
            len = n / 2;
        }
        int[] answer = new int[len];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = 1 + (2 * i);
        }
        return answer;
    }
}