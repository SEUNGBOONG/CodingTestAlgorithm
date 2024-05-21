package LV1;

import java.util.*;

public class UnlikeSameNumber {

    public int[] solution(int[] arr) {
        int[] answer = Arrays.stream(arr)
                .distinct()
                .toArray();
        return answer;

    }

}
