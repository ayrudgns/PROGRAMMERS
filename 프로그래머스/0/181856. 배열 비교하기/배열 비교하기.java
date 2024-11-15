import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        answer = this.compareArray(arr1, arr2);
        
        return answer;
    }
    
    public int compareArray(int[] arr1, int[] arr2) {
        int compareResult = 0;
        
        if(arr1.length == arr2.length) {
            int arr1Sum = Arrays.stream(arr1).sum();
            int arr2Sum = Arrays.stream(arr2).sum();
            
            compareResult = arr1Sum > arr2Sum ? 1
                            : arr1Sum < arr2Sum ? -1
                            : 0;
        } else {
            compareResult = arr1.length > arr2.length ? 1
                            : arr1.length < arr2.length ? -1
                            : 0;
        }
        
        return compareResult;
    }
}