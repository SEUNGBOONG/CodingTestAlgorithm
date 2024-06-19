package LV1;

import java.util.List;

public class 문자열내P와Y개수 {
    public boolean solution(String s) {

        s = s.toLowerCase();


        int countP = 0;
        int countY = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'p') {
                countP++;
            } else if (ch == 'y') {
                countY++;
            }
        }


        return countP == countY;
    }

}
