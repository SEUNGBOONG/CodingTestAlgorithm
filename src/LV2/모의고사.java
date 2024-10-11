package LV2;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {
    public int[] solution(int[] answers) {
        //ex 1,2,3,4,5  ,1,2,3,4,5
        int[] answer = {0,0,0};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<answers.length;i++){
            if(one[i%5]==answers[i]){
                answer[0]++;
            }
            if(two[i%8]==answers[i]){
                answer[1]++;
            }
            if(three[i%10]==answers[i]){
                answer[2]++;
            }
        }
        int max = Math.max(answer[0],Math.max(answer[1],answer[2]));
        for (int i = 0; i < answer.length; i++) {
            if (max == answer[i]) list.add(i + 1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
