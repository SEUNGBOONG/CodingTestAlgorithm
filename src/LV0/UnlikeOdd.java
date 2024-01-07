package LV0;

public class UnlikeOdd {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2]; // n 이하의 홀수가 들어갈 배열의 크기

        int j = 0; // 배열의 인덱스
        extracted(n, answer, j);

        return answer;
    }

    private static void extracted(final int n, final int[] answer, int j) {
        for (int i = 1; i <= n; i += 2) {
            answer[j] = i;
            j++; // 다음 인덱스로 이동
        }
    }
}
