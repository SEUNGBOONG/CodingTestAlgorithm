package LV0;

public class UnlikeOdd {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2]; // n 이하의 홀수가 들어갈 배열의 크기

        int j = 0; // 배열의 인덱스
        for (int i = 1; i <= n; i += 2) {
            answer[j] = i;
            j++; // 다음 인덱스로 이동
        }

        return answer;
    }
}
