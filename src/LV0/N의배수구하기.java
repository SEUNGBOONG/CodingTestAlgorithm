package LV0;

import java.util.ArrayList;
import java.util.List;

public class N의배수구하기 {
    public List<Integer> solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer.add(numlist[i]);
            }
        }
        return answer;
    }
}
