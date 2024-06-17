package LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 두개뽑아서더하기 {

    public int[] solution(int[] numbers) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int sum = numbers[i]+numbers[j];
                if(!temp.contains(sum))
                    temp.add(sum);
            }
        }
        Collections.sort(temp);
        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }

}
