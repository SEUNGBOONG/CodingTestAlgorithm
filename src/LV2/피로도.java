package LV2;

public class 피로도 {
    public int solution(int k, int[][] dungeons) {
        int answer = 0;

        for (int i = 0; i < dungeons.length; i++) {
            if (dungeons[i][0] > k) {
                answer++;
                k=k-dungeons[i][1];
            }
        }

        return answer;
    }
}
