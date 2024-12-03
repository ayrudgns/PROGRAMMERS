import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int[] tmpArr = new int[arr.length];
        int tmpArrIdx = 0;
        
        tmpArr[0] = arr[0];
        tmpArrIdx++;
        
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i + 1]) {
                tmpArr[tmpArrIdx] = arr[i + 1];
                tmpArrIdx++;
            }
        }
        
        answer = Arrays.copyOf(tmpArr, tmpArrIdx);
            
        return answer;
    }
}