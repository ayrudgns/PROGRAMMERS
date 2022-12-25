class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String ms = my_string.replaceAll("[^1-9]", "");
        String[] strArr = ms.split("");
        for(int i = 0; i < strArr.length; i++) {
            answer += Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}