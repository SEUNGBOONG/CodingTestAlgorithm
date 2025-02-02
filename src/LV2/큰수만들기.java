package LV2;

import java.util.*;

public class 큰수만들기 {
    public String solution(String number, int k) {
        String answer = "";

        StringBuilder builder = new StringBuilder();

        int idx = 0;
        int max;
        for(int i = 0; i < number.length()-k; i++){
            // i =0 이고 j 도 0인상태
            max = 0;
            for(int j = idx; j <= i+k; j++){
                if(max < number.charAt(j)-'0'){
                    max = number.charAt(j)-'0';
                    idx = j+1;
                }
            }
            builder.append(max);
        }
        return builder.toString();
    }
}
// 1924 -> 19 짜르고 24담고 12 짜르고 94 담고 14 짜르고 92담고 92 짜르고 14 담고 24짜르고 19담고
