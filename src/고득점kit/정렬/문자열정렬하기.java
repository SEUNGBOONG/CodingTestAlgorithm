package 고득점kit.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class 문자열정렬하기 {

    public List<Integer> solution(String my_string) {

        List<String> s1 = List.of(my_string.split(""));
        List<Integer> s2 = new ArrayList<>();

        for(int i = 0; i<s1.size(); i++){
            char ch = my_string.charAt(i);
            if(Character.isDigit(ch)){
                s2.add(Integer.valueOf(s1.get(i)));
            }
        }

        Collections.sort(s2);
        return s2;
    }

}
