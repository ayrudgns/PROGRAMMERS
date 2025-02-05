class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String xString = String.valueOf(x);
        int sum = 0;
        
        for(int i = 0; i < xString.length(); i++) {
            sum += Integer.parseInt(xString.substring(i, i + 1));
        }
        
        answer =
            x % sum == 0 ? true : false;
        
        return answer;
    }
}