import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = new int[privacies.length];

        for(int i = 0; i < privacies.length; i++) {
            String termType = privacies[i].substring(privacies[i].length() - 1);

            for(int j = 0; j < terms.length; j++) {
                // terms 요소의 시작(약관 종류)과 privacies 요소의 끝(약관 종류)이 같으면
                if(terms[j].startsWith(termType)) {
                    int indexOfSplit = privacies[i].indexOf(" ");
                    int termPeriod = Integer.parseInt(terms[j].substring(terms[j].indexOf(" ") + 1));

                    LocalDate convertedToday = this.dateConvert(today);
                    LocalDate convertedPrivaciesDay = this.dateConvert(privacies[i].substring(0, indexOfSplit));

                    // today와 privacies 요소의 날짜 차이를 구하고,
                    // 그 날짜 차이가 terms 요소의 끝(약관 유효기간)보다 크면 answer 배열에 추가
                    if((int)ChronoUnit.MONTHS.between(convertedPrivaciesDay, convertedToday) >= termPeriod) {
                        answer[i] = i + 1;
                    }
                }
            }
        }
        
        return Arrays.stream(answer).filter(index -> index != 0).toArray();
    }
    
    public LocalDate dateConvert(String dateString) {
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate convertedDate = LocalDate.parse(dateString, customFormatter);
        
        return convertedDate;
    }
}