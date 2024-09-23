package 고득점kit.해시;

import java.util.HashMap;
import java.util.Map;

public class 의상해시풀이 {
    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> kinds = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            kinds.put(clothes[i][1], kinds.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (int i : kinds.values()) {
            answer *= i + 1;
        }

        // 아무것도 입지 않는 경우 제외
        return answer - 1;
    }
}
