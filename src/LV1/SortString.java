package LV1;

import java.util.Arrays;

public class SortString {
    public String solution(String s) {
        String answer = "";
        char str[] = s.toCharArray();
        Arrays.sort(str);
        for (int i = str.length - 1; i >= 0; i--) {
            answer += str[i];
        }
        return answer;
    }

}
