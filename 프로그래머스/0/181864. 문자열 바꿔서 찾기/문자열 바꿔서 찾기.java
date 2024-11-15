class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] answerArray = new String[myString.length()];
        String tempString = "";
        
        for(int i = 0; i < myString.length(); i++) {
            // 문자열을 배열로 쪼갠 후
            answerArray[i] = String.valueOf(myString.charAt(i));
            // 문자를 치환한다.
            answerArray[i] = answerArray[i].equals("A") ? "B" : "A";
        }

        tempString = String.join("", answerArray);

        answer = tempString.contains(pat) ? 1 : 0;

        return answer;
    }
}