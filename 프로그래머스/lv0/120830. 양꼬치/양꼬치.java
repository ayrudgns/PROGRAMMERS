class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int service_drink = 0;
        if(n >= 10) {
            service_drink = n / 10;
            k = k - service_drink;
        }
        
        int yang_price_sum = n * 12000;
        int drink_price_sum = k * 2000;
        
        answer = yang_price_sum + drink_price_sum;
        return answer;
    }
}