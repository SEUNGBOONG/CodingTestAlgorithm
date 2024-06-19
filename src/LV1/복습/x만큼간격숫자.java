package LV1.복습;

import java.util.ArrayList;
import java.util.List;

public class x만큼간격숫자 {
    public List<Integer> solution(int x, int n) {
        List<Integer> answer = new ArrayList<>();
        int c = x;
        for (int i = 0; i < n; i++) {
            answer.add(x);
            x = x + c;
        }
        return answer;
    }

    public static void main(String[] args) {
        x만큼간격숫자 x만큼간격숫자 = new x만큼간격숫자();
        List<Integer> a = x만큼간격숫자.solution(2, 5);
        System.out.println(a);
    }
}

