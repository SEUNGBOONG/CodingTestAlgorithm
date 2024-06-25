package LV1;

import java.util.List;

public class 소수찾기 {
    public int solution(int n) {
        int i;
        int answer = 0;

        if (n >= 3) {
            answer = 2;
            for (i = 4; i <= n; i++) {

                if (i % 2 != 0 && i % 3 != 0) {
                    answer++;
                }
            }
        }
        else if (n <= 3) {
            answer = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        소수찾기 s = new 소수찾기();
        System.out.println(s.solution(2));
    }
}
