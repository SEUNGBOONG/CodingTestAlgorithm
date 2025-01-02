package LV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 귤고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int maxSize = 0;
        int size = 0;
        Arrays.stream(tangerine).sorted();
        for (int i = 0; i < tangerine.length; i++) {
            list.get(tangerine[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != list.get(i + 1)) {
                break;
            }
        }

        return answer;
    }

}
// 1 2 2 3 3 4 5 5
