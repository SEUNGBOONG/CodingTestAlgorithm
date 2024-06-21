package LV1;

import java.util.Arrays;

public class 사과최대이익2 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i =score.length; i>=0; i-=m){
            answer += m*(score[i]);
        }
        return answer;
    }
}
