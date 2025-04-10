package LV1;

import java.util.ArrayList;
import java.util.List;

public class 푸드파이트 {
    public String solution(int[] food) {
        String answer = "";

        for(int i =0; i<food.length;i++){
            if(food[i]%2!=0){
                food[i]-=1;
            }
        }

        List<String> list =new ArrayList<>();
        for(int i=1;i<food.length/2;i++) {
            for (int j =0; j<food[i];j++){
                list.add(String.valueOf(food[i]));
            }
        }

        for(int i=1;i<food.length/2;i++) {
            for (int j =0; j<food[i];j++){
                list.add(String.valueOf(food[i]));
            }
        }

        return answer;
    }
}
