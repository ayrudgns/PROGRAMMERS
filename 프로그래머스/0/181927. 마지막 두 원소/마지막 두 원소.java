class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int second_to_last = num_list[num_list.length - 2];
        int last = num_list[num_list.length -1];
        int adding_last = 
            second_to_last < last ? (last - second_to_last) : (last * 2);
    
        for(int i = 0; i < answer.length; i++) {
            answer[i] = 
                i == answer.length - 1 ? adding_last : num_list[i];
        }
    
        return answer;
    }
}