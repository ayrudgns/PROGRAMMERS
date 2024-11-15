class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String joinValue = "";
        int multipleValue = 0;
        
        joinValue = a + "" + b;
        multipleValue = 2 * a * b;
        
        answer = Integer.parseInt(joinValue) >= multipleValue
                ? Integer.parseInt(joinValue)
                : multipleValue;
        
        return answer;
    }
}