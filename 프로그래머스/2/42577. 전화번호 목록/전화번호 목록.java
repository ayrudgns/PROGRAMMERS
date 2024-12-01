import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // phone_book 배열을 리스트로 변환하여 HashSet에 할당
        HashSet<String> hs = new HashSet<>(Arrays.asList(phone_book));
        
        // phone_book 배열 for문
        for(String phoneNumber : phone_book) {
            // phone_book 배열 요소인 phoneNumber의 값을
            // for문으로 잘라가며 접두사 처리
            for(int i = 0; i < phoneNumber.length(); i++) {
                String prefix = phoneNumber.substring(0, i);
                
                // 자른 접두사를 HashSet이 포함하고 있으면 false를 return
                if(hs.contains(prefix)) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
        
        // 아래 방법은 정답은 나오지만 시간 초과
        // 하나의 배열을 이중 for문
        // for(int i = 0; i < phone_book.length; i++) {
        //     for(int j = 0; j < phone_book.length; j++) {
        //         if(i != j) {
        //             if(phone_book[i].startsWith(phone_book[j])) {
        //             // phone_book[j]가 phone_book[i]의 접두어인 경우
        //             answer = false;
        //             break;
        //             }
        //         }
        //     }    
        // }
        // return answer;
    }
}