package LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 가장가까운글자 {
    public int[] solution(String s) {
        int[] answer = {};
        List<String> list = new ArrayList<>();
        for(int i = 0; i<s.length();i++){
            String str = Arrays.toString(s.split(""));
            list.add(str);
            if(!list.contains(str)){
                answer[i]=-1;
            }
            if(list.contains(str)){
                list.indexOf(str);
            }
        }

        return answer;
    }

    //"banana"	[-1, -1, -1, 2, 2, 2]
    //"foobar"	[-1, -1, 1, -1, -1, -1]
}
