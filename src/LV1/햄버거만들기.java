package LV1;

import java.util.ArrayList;
import java.util.List;

public class 햄버거만들기 {
    public int solution(int[] ingredient) {
        int answer = 0;
        int number =1;
        List<Integer> a = new ArrayList<>();
        for(int i =0; i<ingredient.length;i++){
            if(ingredient[i]==number){
                a.add(ingredient[i]);
                number++;
                if(number==3){
                    number=0;
                }
            }
        }

        for(int i =0; i<a.size();i++){

        }
        return answer;
    }

}
