package LV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 귤고르기 {
    class Solution {
        public int solution(int k, int[] tangerine) {
            Map<Integer, Integer> countMap = new HashMap<>();

            // 각 크기의 귤 개수 세기
            for (int size : tangerine) {
                countMap.put(size, countMap.getOrDefault(size, 0) + 1);
            }

            // 개수 내림차순 정렬
            List<Integer> counts = new ArrayList<>(countMap.values());
            counts.sort(Collections.reverseOrder());

            // 가장 많은 종류부터 담기
            int result = 0;
            int total = 0;
            for (int count : counts) {
                total += count;
                result++;
                if (total >= k) break;
            }

            return result;
        }
    }

}
