class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 단어를 공백 기준으로 끊어서 배열에 할당
        String[] strSplitArr = s.split(" ", -1);
        
        // 배열에 할당된 단어의 첫 문자가 소문자이면 대문자로 바꾸기
        // 배열에 할당된 단어의 첫 문자를 제외한 모든 문자는 소문자로 바꾸기
        // 숫자는 toUpperCase(), toLowerCase() 상관없음
        for(int i = 0; i < strSplitArr.length; i++) {
            if(!strSplitArr[i].isEmpty()) {
                strSplitArr[i] = strSplitArr[i].substring(0, 1).toUpperCase()
                                    + strSplitArr[i].substring(1, strSplitArr[i].length()).toLowerCase();
            }
            answer += " ";
        }
        
        // 문자열로 다시 합치기
        answer = String.join(" ", strSplitArr);
        
        return answer;
    }
}