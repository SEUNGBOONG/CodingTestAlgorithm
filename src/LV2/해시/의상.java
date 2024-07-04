package LV2.해시;

import java.util.HashMap;
import java.util.Map;

public class 의상 {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            map.put(i, clothes[i][0]);
            map.put(i, clothes[i][1]);
        }

        for (int i = 1; i < map.size(); ) {
            for (int j = 1; j < map.size(); ) {
                if (!map.get(i).equals(map.get(j))) {
                    answer++;
                }
                j += 2;
            }
            i += 2;

        }
        return answer;
    }
}
