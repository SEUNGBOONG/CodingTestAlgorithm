package LV1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 사과최대이익 {
    public int solution(int k, int m, int[] score) {
        //k가최대점수 / m이박스개수 	[1, 2, 3, 1, 2, 3, 1]
        List<Integer> list = new ArrayList<>();
        int answer = 0;

        for(int num:score){
            list.add(num);
        }
        Collections.sort(list);
        for(int i =score.length-m; i>=0;i-=m){
            answer=+m*(list.get(i));
        }

        return answer;
    }
}
