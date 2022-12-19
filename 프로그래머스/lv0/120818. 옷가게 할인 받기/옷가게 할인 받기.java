class Solution {
    public int solution(int price) {
        int answer = 0;
        double salesPer = 1;
        if(price >= 100000) {
            salesPer = 0.95;
            if(price >= 300000) {
                salesPer = 0.9;
                if(price >= 500000) {
                    salesPer = 0.8;
                }
            }
        }
        answer = (int)(price * salesPer);
        return answer;
    }
}