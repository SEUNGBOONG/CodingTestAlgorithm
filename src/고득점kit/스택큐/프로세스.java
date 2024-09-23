package 고득점kit.스택큐;

import java.util.Collections;
import java.util.PriorityQueue;

public class 프로세스 {
    public int solution(int[] priorities, int location) {

        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());


        for (int i : priorities) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {

            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]){
                    queue.poll();
                    answer++;
                    if (location == i) {
                        return answer;
                    }
                }
            }

        }
        return answer;
    }
}


//[2, 1, 3, 2]	2	1
// 	[1, 1, 9, 1, 1, 1], 0
