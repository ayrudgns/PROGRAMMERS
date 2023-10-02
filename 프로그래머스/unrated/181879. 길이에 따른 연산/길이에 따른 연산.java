class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        if(num_list.length >= 11) {
            answer = this.numListSum(num_list);
        } else if (num_list.length <= 10) {
            answer = this.numListTimes(num_list);
        }
        
        return answer;
    }
    
    public int numListSum(int[] num_list) {
        int sum = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
        }

        return sum;
    }
    
    public int numListTimes(int[] num_list) {
        int times = 1;
        
        for(int i = 0; i < num_list.length; i++) {
            times *= num_list[i];
        }

        
        return times;
    }
}