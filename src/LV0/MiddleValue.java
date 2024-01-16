package LV0;


import java.util.Arrays;

public class MiddleValue {
    public int solution(int[] array) {
        Arrays.sort(array);

        int median;

        if (array.length % 2 == 1) {
            median = array[array.length / 2];
        }
        else {
            int middleIndex = array.length / 2;
            median = (array[middleIndex - 1] + array[middleIndex]) / 2; // 중앙 두 값의 평균
        }

        return median;
    }
}
