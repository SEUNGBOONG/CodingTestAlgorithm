package LV1.복습;

import java.util.Arrays;

import static java.lang.String.valueOf;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        String str = valueOf(x);
        String[] str2 = str.split("");

        int sum = 0;

        for (String num : str2) {
            sum += Integer.parseInt(num);
        }
        if (x % sum == 0) {
            return answer;
        }
        return false;

    }

    public static void main(String[] args) {
        하샤드수 하샤드수 = new 하샤드수();
        하샤드수.solution(10);
    }
}
