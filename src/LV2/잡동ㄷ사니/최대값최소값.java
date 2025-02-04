package LV2.잡동ㄷ사니;

import java.util.ArrayList;
import java.util.List;

public class 최대값최소값 {
    public String solution(String s) {

        String[] temp = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (int i=0; i<temp.length; i++){
            int num = Integer.parseInt(temp[i]);

            min = Math.min(min, num);
            max = Math.max(max, num);
        }


        String answer = "";
        answer = min+" "+max;
        return answer;
    }

}
