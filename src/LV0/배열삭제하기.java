package LV0;

import java.util.ArrayList;
import java.util.List;

public class 배열삭제하기 {
    //    public List<Integer> solution(int[] arr, int[] delete_list) {
//        List<Integer> answer = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < delete_list.length; j++) {
//                if (arr[i] != delete_list[j]) {
//                    answer.add(arr[i]);
//                }
//            }
//        }
//        return answer;
//    }
//
    // 두번쨰방법
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();

        for (int value : arr) {
            answer.add(value);
        }

        for (int value : delete_list) {
            answer.remove(value); // 자동 박싱: int를 Integer로 자동 변환
        }

        return answer;
    }
}
