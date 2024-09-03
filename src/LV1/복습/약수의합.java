package LV1.복습;

import java.util.ArrayList;
import java.util.List;

public class 약수의합 {
    public int solution(int n) {
        int answer = 0;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            if (n % i == 0) {
                numbers.add(i);
            }
        }
        for (int j = 0; j < numbers.size(); j++) {
            answer += numbers.get(j);
        }
        return answer;

    }
}
