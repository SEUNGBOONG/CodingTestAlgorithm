package LV0;

import java.util.Arrays;

public class dupliArr {
    public int solution(int[] array, int n) {
        int answer = 0;
        int count=0;
        int i;
        answer = getAnswer(array, n, count, answer);
        return answer;
    }

    private static int getAnswer(final int[] array, final int n, int count, int answer) {
        int i;
        for(i=0; i< array.length; i++){
            if(array[i] == n){
                count++;
            }
            answer = count;
        }
        return answer;
    }
}
