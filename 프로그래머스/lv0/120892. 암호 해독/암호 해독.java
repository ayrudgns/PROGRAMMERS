class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] strArr = cipher.split("");
        int cnt = strArr.length / code;
        int steps = 1;
        while(steps <= cnt) {
            answer += strArr[(code * steps) - 1];
            steps++;
        }
        return answer;
    }
}