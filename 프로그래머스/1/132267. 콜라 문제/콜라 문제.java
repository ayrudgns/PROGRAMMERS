class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        // a는 콜라를 받기 위해 마트에 주어야 하는 병 수
        // b는 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수
        // n은 상빈이가 가지고 있는 빈 병의 개수
        
        // 나머지
        int temp = 0;
        
        while(n >= a) {
            // 누적 개수 확인
            answer += ((n / a) * b);

            // 나머지 적립
            temp = n % a != 0 ? n % a : 0;
            
            // 나머지가 없으면 그냥 계산, 나머지가 있으면 나머지를 더해서 계산
            n = temp == 0 ? ((n / a) * b) : (((n / a) * b) + temp);
            
        }
        
        return answer;
    }
}