package LV1.복습;

import java.util.ArrayList;
import java.util.List;

public class 자릿수더하기 {

    // 981
    public int solution(String n) {
        int answer = 0;
        String[] b=n.split("");
        List<Integer> a = new ArrayList<>();
        for (String string : b) {
            a.add(Integer.valueOf(string));
        }

        for(int i = 0; i<a.size();i++){
            answer += a.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        자릿수더하기 c = new 자릿수더하기();
        int sum =c.solution("123");
        System.out.println(sum);
    }
}
