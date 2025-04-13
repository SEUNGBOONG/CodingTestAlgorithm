package LV1;

import java.util.PriorityQueue;
import java.util.Queue;

public class 덧칠하기 {
//    public int solution(int n, int m, int[] section) {
//        int answer = 0;
//        Queue<Integer> queue = new PriorityQueue<>();
//        for(int i =0; i<section.length;i++){
//            queue.add(section[i]);
//        }
//
//        while (!queue.isEmpty()){
//            int number = queue.poll();
//            for (int i = 0; i<m;i++){
//                if (queue.peek()==(number)){
//                    queue.poll();
//                }
//            }
//            answer++;
//        }
//        System.out.println(answer);
//
//        return answer;
//    }

    class Solution {
        public int solution(int n, int m, int[] section) {
            int answer = 0;
            int rollerEnd = 0;  // 마지막으로 칠한 구역의 끝 위치

            for (int pos : section) {
                if (pos > rollerEnd) {
                    // 현재 위치가 아직 칠해지지 않았다면, 여기서 롤러 시작
                    rollerEnd = pos + m - 1;
                    answer++;
                }
            }

            return answer;
        }
    }


}
