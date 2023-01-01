class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] my_charArr = my_string.toCharArray();
        for(int i = 0; i < my_charArr.length; i++) {
            if(my_charArr[i] >= 97) {
                my_charArr[i] -= 32; 
            } else {
                my_charArr[i] += 32;
            }
        }
        answer = new String(my_charArr);
        return answer;
    }
}