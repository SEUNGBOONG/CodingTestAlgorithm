package LV0;

public class 원스들의곱과합 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag) {
            answer = a + b;
        } else if (!flag) {
            answer = a - b;
        }
        return answer;
    }
}
