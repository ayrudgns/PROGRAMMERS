class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        answer = this.filtering(num_list, n);
        
        return answer;
    }
    
    public int[] filtering(int[] num_list, int n) {
        int filteredAnswerLength = 0;
        
        if(num_list.length % n == 0) {
            filteredAnswerLength = num_list.length / n;
        } else if (num_list.length % n != 0) {
            filteredAnswerLength = (num_list.length / n) + 1;
        }
        
        int[] filteredAnswer = new int[filteredAnswerLength];
        
        for(int i = 0; i < filteredAnswerLength; i++) {
            filteredAnswer[i] = num_list[i * n];
        }
        
        return filteredAnswer;
    }
}