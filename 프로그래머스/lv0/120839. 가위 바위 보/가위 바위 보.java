class Solution {
    public String solution(String rsp) {
        String answer = "";
        // 가위 2는 0 반환, 바위 0은 5 반환, 보 5는 2 반환
        // 값을 받아와서 / 배열로 쪼개주고 / 문자 대체해주고 / 다시 문자열로 합쳐서 / 반환
        
        String[] rspArr = new String[rsp.length()];
        
        rspArr = rsp.split("");         // 쪼개주고
        
        charReplace(rspArr);            // 문자 대체해주고
        
        for(int i = 0; i < rspArr.length; i++) {
            answer += rspArr[i];
        }
        
        return answer;
    }
    
    public String[] charReplace(String[] rspArr) {      // 대체해주고
        
        for(int i = 0; i < rspArr.length; i++) {
            if(rspArr[i].equals("0")) {
                rspArr[i] = "5";
            } else if (rspArr[i].equals("2")) {
                rspArr[i] = "0";
            } else if (rspArr[i].equals("5")) {
                rspArr[i] = "2";
            }
        }
        
        return rspArr;
    }
}