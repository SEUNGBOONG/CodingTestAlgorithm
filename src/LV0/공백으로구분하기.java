package LV0;

import java.util.ArrayList;
import java.util.List;

public class 공백으로구분하기 {
    public 공백으로구분하기() {
    }

    public String[] solution(String my_string) {
        String[] answer = {};
        answer = my_string.split(" ");
        return answer;
    }
}
