package LV0;

import java.util.Arrays;

public class dupliArr {
    public int solution(int[] array, int n) {
        int answer = 0;
        int count=0;
        int i;
        for(i=0; i<array.length;i++){
            if(array[i] ==n){
                count++;
            }
            answer=count;
        }

        return answer;
    }
}
