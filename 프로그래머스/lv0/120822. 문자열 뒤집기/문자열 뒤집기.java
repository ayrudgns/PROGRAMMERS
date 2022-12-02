class Solution {
    public String solution(String my_string) {
        String answer = "";
        int str_length = my_string.length();
        char[] answer_string = new char[str_length];
        char[] my_str_arr = my_string.toCharArray();
        
        for(int i = 0; i < str_length; i++) {
            answer_string[i] = my_str_arr[my_str_arr.length - 1 - i];
        }
        answer = new String(answer_string);
        return answer;
    }
}