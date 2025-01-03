class Solution {
    public String[] solution(String[] names) {
        int fifthsCount = (names.length % 5 > 0) 
            				? (names.length / 5) + 1
                            : (names.length / 5);

        String[] answer = new String[fifthsCount];
        
        for(int i = 0; i < fifthsCount; i++) {
            answer[i] = names[5 * i];
        }
        
        return answer;
    }
}