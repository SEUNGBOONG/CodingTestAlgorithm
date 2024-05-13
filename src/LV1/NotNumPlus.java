package LV1;

import java.util.Arrays;
import java.util.List;

public class NotNumPlus {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int num : numbers){
            answer-=num;
        }
        return answer;
    }
}
