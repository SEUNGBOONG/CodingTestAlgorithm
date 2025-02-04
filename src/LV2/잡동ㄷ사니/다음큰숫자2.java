package LV2.잡동ㄷ사니;

public class 다음큰숫자2 {
    public int solution(int n) {
        int targetCount = Integer.bitCount(n);

        while (true) {
            n++;
            if (Integer.bitCount(n) == targetCount) {
                return n;
            }
        }
    }

    public static void main(String[] args) {
        다음큰숫자2 a = new 다음큰숫자2();
        System.out.println(a.solution(78));
    }

}
