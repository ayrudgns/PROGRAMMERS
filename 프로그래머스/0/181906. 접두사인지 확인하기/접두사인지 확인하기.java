class Solution {
    public int solution(String my_string, String is_prefix) {
        return this.checkPrefix(my_string, is_prefix);
    }
    
    public int checkPrefix(String s, String p) {
        int answer = 0;
        
        if(s.startsWith(p)) {
           answer = 1; 
        }
        
        return answer;
    }
}