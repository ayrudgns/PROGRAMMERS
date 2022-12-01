class Solution {            // odd : 홀수, even : 짝수
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odd_count = 0;
        int even_count = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 1) {      // 홀수
                odd_count++;
            } else {                        // 짝수
                even_count++;
            }
        }
        answer[0] = even_count;
        answer[1] = odd_count;
        return answer;
    }
}