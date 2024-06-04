class Solution {
    public int[] solution(int start, int end_num) {
        return this.downOneByOne(start, end_num);
    }
    
    public int[] downOneByOne(int start, int end) {
        int[] answer = new int[start - end + 1];
        
        for(int i = end; i <= start; i++) {
            answer[i - end] = start - i + end;
        }
        
        return answer;
    }
    
}