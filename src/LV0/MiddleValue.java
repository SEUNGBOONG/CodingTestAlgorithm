package LV0;


import java.util.Arrays;

public class MiddleValue {
    public int solution(int[] array) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(array);

        // 중앙값을 저장할 변수
        int median;

        if (array.length % 2 == 1) {
            median = array[array.length / 2]; // 중앙값은 중간 위치의 요소
        }
        else {
            int middleIndex = array.length / 2;
            median = (array[middleIndex - 1] + array[middleIndex]) / 2; // 중앙 두 값의 평균
        }

        return median;
    }
}
