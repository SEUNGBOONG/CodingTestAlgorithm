package LV2.잡동ㄷ사니;

public class 숫자의표현 {
    public int solution(int n) {
        int answer = 0;
        int start = 1;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            while (sum > n) {
                sum -= start;
                start++;
            }
            if (sum == n) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        숫자의표현 a = new 숫자의표현();
        a.solution(15);
        System.out.println(a.solution(15));
    }
}
