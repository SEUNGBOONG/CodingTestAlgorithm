package 고득점kit.정렬;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열잘라서정렬하기 {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");
        ArrayList<String> resultList = new ArrayList<>();

        for (String str : splitArr) {
            if (!str.isEmpty()) {
                resultList.add(str);
            }
        }

        String[] resultArr = resultList.toArray(new String[resultList.size()]);
        Arrays.sort(resultArr);

        return resultArr;
    }
}
