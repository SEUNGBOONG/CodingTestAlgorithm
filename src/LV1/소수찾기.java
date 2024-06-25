package LV1;

import java.util.List;

public class 소수찾기 {
    public int solution(int n) {
        int answer = 1;

        for (int i = 3; i <= n; i++) {
            int cnt = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    cnt++;
                    break;
                }
            }
            if(cnt == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        소수찾기 s = new 소수찾기();
        System.out.println(s.solution(2));
    }
}
