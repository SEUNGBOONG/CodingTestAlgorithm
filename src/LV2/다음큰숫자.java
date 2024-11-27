package LV2;

import java.util.Collections;
import java.util.List;

public class 다음큰숫자 {
    public int solution(int n) {
        int count = 0;
        int count1 = 0;
        List<String> binary1 = Collections.singletonList(Integer.toBinaryString(n));
        for (String num : binary1) {
            if (num == "1") {
                count++; // 1이면 개수 증가
            }
        }

        while (true) {
            n++;
            List<String> binary2 = Collections.singletonList(Integer.toBinaryString(n));

            if (count != count1) {
                for (String num : binary2) {
                    if (num == "1") {
                        count1++; // 1이면 개수 증가
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        다음큰숫자 a = new 다음큰숫자();
        System.out.println(a.solution(78));
    }
}

