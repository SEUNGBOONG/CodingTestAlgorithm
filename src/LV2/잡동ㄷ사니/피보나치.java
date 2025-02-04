package LV2.잡동ㄷ사니;



public class 피보나치 {
    public int solution(int n) {
        int MOD = 1234567;

        int prev2 = 0;
        int prev1 = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = (prev1 + prev2) % MOD;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        피보나치 a = new 피보나치();
        System.out.println(a.solution(5));
        System.out.println(a.solution(100)); // 예: 782204094
    }
}
