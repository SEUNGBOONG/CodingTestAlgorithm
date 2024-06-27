package LV0;

import java.util.ArrayList;
import java.util.List;

public class 카운트업 {
    public List<Integer> solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();
        for (int i = start_num; i <=end_num;i++ ) {
            answer.add(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        카운트업 a = new 카운트업();
        System.out.println(a.solution(3,10));

    }
}
