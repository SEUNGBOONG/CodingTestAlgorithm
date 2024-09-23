package LV1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 삼진법뒤집기 {
    public int solution(int n) {
        String a = "";
        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }

        // 앞 뒤 반전
        a = new StringBuilder(a).reverse().toString();

        // 3진법 -> 10진법
        return Integer.parseInt(a,3);
    }
}
