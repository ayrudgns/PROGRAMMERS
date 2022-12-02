class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total / num;
        int cnt = num / 2;
        if(total % num == 0) {
            for(int i = 0; i < answer.length; i++) {
                answer[i] = mid - cnt + i;
            }
        } else {
            for(int i = 0; i < answer.length; i++) {
                // mid = 3, cnt = 2
                answer[i] = mid - cnt + 1 + i;
            }
        }
        return answer;
    }
}