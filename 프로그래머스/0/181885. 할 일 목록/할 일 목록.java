import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        for(int i = 0; i < todo_list.length; i++) {
            if(finished[i] == true) {
                todo_list[i] = "";
            } 
        }
        
        String[] answer = Arrays.stream(todo_list)
                            .filter(todo -> todo.isEmpty() == false)
                            .toArray(String[]::new);

        return answer;
    }
}