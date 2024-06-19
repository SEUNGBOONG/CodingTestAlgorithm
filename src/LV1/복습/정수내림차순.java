package LV1.복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 정수내림차순 {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);
        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }
}
