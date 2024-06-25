package LV1;

import java.util.List;

public class 소수찾기 {
    public int solution(int n) {
        int answer = 2;
        int i;
        for (i = 2; i <= n; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                answer++;
            }
        }
        return answer;
    }
}
