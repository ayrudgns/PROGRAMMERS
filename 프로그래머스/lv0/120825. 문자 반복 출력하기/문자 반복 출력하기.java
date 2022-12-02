class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] str_arr = my_string.toCharArray();
        char[] str_times = new char[my_string.length() * n];
        
        for(int j = 0; j < n; j++) {            // n번 돌린다.
            for(int i = 0; i < str_arr.length; i++) {        // str_arr.length번 돌린다.
                    str_times[(i * n) + j] = str_arr[i];        // 0, 3, 6, 9
            }                                                   // 1, 4, 7, 10
        }                                                       // 위와 같은 방식으로 for문 실행

        answer = new String(str_times);
        return answer;
    }
}
