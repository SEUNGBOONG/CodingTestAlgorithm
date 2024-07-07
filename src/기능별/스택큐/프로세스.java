package 기능별.스택큐;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 프로세스 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();


        List<Integer> a = (List<Integer>) Arrays.stream(priorities).sorted();


        for (int i = location; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }
        for (int j = 0; j < location; j++) {
            queue.add(priorities[j]);
        }
        while (priorities[location] == queue.peek()) {
            queue.poll();
            answer++;
        }

        return answer;
    }
}


//[2, 1, 3, 2]	2	1
// 	[1, 1, 9, 1, 1, 1], 0