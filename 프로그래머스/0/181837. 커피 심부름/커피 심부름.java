class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        // 아메리카노 4,500원 : 라떼 5,000원
        // 메뉴만 적은 팀원은 iced
        // "아무거나"를 적은 팀원은 americano iced
        for(int i = 0; i < order.length; i++) {
            if(order[i].contains("cafelatte")) {
                answer += 5000;                
            } else {
                answer += 4500;
            }
        }
        
        return answer;
    }
}