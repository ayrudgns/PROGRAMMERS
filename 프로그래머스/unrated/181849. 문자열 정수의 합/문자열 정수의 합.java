class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        int[] num_arr = new int[num_str.length()];
        
        for(int i = 0; i < num_arr.length; i++) {
            num_arr[i] = Integer.parseInt(num_str.charAt(i) + "");
            answer += num_arr[i];
        }
        
        return answer;
    }
}