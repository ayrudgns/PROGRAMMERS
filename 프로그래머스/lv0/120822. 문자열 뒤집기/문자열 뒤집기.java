class Solution {
    public String solution(String my_string) {
        String answer = "";
        int str_length = my_string.length();
        char[] answer_string = new char[str_length];
        char[] my_str_arr = my_string.toCharArray();            // String을 char[]로 바꾸기
        
        for(int i = 0; i < str_length; i++) {
            answer_string[i] = my_str_arr[my_str_arr.length - 1 - i];
        }
        answer = new String(answer_string);                     // char[]을 String으로 바꾸기
        return answer;
    }
}
