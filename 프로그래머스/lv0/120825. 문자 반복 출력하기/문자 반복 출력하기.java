class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] str_arr = my_string.toCharArray();
        char[] str_times = new char[my_string.length() * n];
        
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < str_arr.length; i++) {        // n번 돌린다.
                    str_times[(i * n) + j] = str_arr[i];
            }
        }

        answer = new String(str_times);
        return answer;
    }
}