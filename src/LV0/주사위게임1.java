package LV0;

public class 주사위게임1 {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0) {
            answer = a*a + b*b;
        } else if (a % 2 != 0 || b % 2 != 0) {
            answer = 2 * (a + b);
        } else {
            if (a < b) {
                answer = (a - b) * -1;
            } else {
                answer = a - b;
            }
        }
        return answer;
    }
}
