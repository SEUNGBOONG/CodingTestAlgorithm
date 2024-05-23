package LV1;

import java.util.Arrays;

public class 물품지원 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            result += d[i];
            if (result > budget) {
                answer=i;
                break;
            }
            else if ( result<= budget){
                answer+=d.length;
            }

        }

        return answer;

    }
}
