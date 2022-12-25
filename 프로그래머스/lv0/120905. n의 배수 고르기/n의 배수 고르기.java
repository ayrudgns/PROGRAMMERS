class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int cnt = 0;
        for(int i = 0; i < numlist.length; i++) {
            if((numlist[i] % n) != 0) {
                numlist[i] = 0;
                cnt++;
            }
        }
        int[] tmp = new int[numlist.length - cnt];
        int cnt2 = 0;
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] != 0) {
                tmp[cnt2] = numlist[i];
                cnt2++;
            }
        }
        answer = tmp;
        return answer; 
    }
}