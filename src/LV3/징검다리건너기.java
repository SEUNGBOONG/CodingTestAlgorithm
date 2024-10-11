package LV3;

public class 징검다리건너기 {
    public int solution(int[] stones, int k) {
        int answer = 0;

        for (int i = 0; i < stones.length; i++) {
            int j = 0;
            if (stones[i] != 0) {
                stones[i] -= 1;
            } else {
                while (j == k) {
                    if (stones[i] == 0) {
                        j++;
                    } else {
                        stones[i] -= 1;
                    }
                    i += j;
                }

            }
        }
        answer++;


        return answer;
    }
}
