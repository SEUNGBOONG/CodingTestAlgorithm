package LV0;

import java.util.ArrayList;
import java.util.List;

public class N의배수구하기 {
    public List<Integer> solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer.add(numlist[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        N의배수구하기 n = new N의배수구하기();

        System.out.println(n.solution(5, new int[]{1,9,3,10,13,5}));
    }
}
