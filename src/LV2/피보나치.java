package LV2;

public class 피보나치 {
    public int solution(int n) {
        // n이 1 또는 2일 경우 1 반환
        if (n == 1 || n == 2) {
            return 1;
        }

        int prev1 = 1; // (n-1)번째 피보나치 값
        int prev2 = 1; // (n-2)번째 피보나치 값
        int current = 0;

        // n번째 피보나치 값을 계산
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        피보나치 a = new 피보나치();
        System.out.println(a.solution(5)); // 5 출력
    }
}
