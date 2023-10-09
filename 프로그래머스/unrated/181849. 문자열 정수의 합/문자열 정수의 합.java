class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        answer = this.jaritsuSum(num_str);
        
        return answer;
    }
    
    public int jaritsuSum(String num_str) {
        int[] num_arr = new int[num_str.length()];
        int sum = 0;
        
        for(int i = 0; i < num_arr.length; i++) {
            num_arr[i] = Integer.parseInt(num_str.charAt(i) + "");
            sum += num_arr[i];
        }
        
        return sum;
    }
}