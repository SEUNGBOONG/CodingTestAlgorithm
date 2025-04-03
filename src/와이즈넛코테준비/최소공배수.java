package 와이즈넛코테준비;

public class 최소공배수 {

    public static int solution(int[] arr) {
        int lcm = arr[0]; // 첫 번째 숫자로 초기화
        for (int i = 1; i < arr.length; i++) {
            lcm = getLCM(lcm, arr[i]); // 이전 LCM과 현재 숫자의 최소공배수 계산
        }
        return lcm;
    }

    // 최소공배수(LCM) 계산
    private static int getLCM(int a, int b) {
        return (a * b) / getGCD(a, b);
    }

    // 최대공약수(GCD) 계산 (유클리드 호제법)
    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


}
