package 고득점kit.정렬;

import java.util.ArrayList;
import java.util.Collections;

public class 문자열내맘대로정렬하기 {
    public String[] solution(String[] strings, int n) {

        String[] answer= {};
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i<strings.length; i++){
            arr.add(""+strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i<arr.size(); i++){
            answer[i] = arr.get(i).substring(1);
        }
        return answer;
    }
}
