class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String orderStr = String.valueOf(order);

        for(int i = 0; i < orderStr.length(); i++) {
            // char 타입 문자를 숫자로 변환
            int orderNum = Character.getNumericValue(orderStr.charAt(i));
            
            if(orderNum != 0 && orderNum % 3 == 0) {
                answer++;                    
            }          
        }
        
        return answer;
    }
}