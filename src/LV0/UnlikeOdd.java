package LV0;

public class UnlikeOdd {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];
        int j = 0;
        extracted(n, answer, j);
        return answer;
    }
    private static void extracted(final int n, final int[] answer, int j) {
        for (int i = 1; i <= n; i += 2) {
            answer[j] = i;
            j++;
        }
    }
}
