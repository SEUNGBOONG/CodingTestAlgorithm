package LV1;

import java.util.Arrays;

public class Bedivide2 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if (answer.length == 0) answer = new int[]{-1};
        return answer;
    }
}
