package LV2;

import java.util.Arrays;

public class JadeCase문자열만들기 {
    public String solution(String s) {
        s= Arrays.toString(s.split(" ")).substring(0,1).toUpperCase()+s.substring(1);
        return s;
    }
}
