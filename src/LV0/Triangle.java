package LV0;

import java.util.Arrays;

public class Triangle {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        if (sides[2] < sides[0] + sides[1]) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
