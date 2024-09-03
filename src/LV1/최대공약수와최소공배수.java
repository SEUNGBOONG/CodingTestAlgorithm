package LV1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {

        int[] answer = {};
        List<Integer> numberList = new ArrayList<>();
        List<Integer> numberList2 = new ArrayList<>();
        List<Integer> maxNumbers = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                numberList.add(i);
            }
        }
        for (int i = 1; i < m + 1; i++) {
            if (m % i == 0) {
                numberList2.add(i);
            }
        }
        for (int i = 0; i < numberList2.size(); i++) {
            if (numberList.contains(numberList2.get(i))) {
                maxNumbers.add(numberList2.get(i));
            }
        }
        int num1 = Collections.max(maxNumbers);

        return answer;
    }

}
