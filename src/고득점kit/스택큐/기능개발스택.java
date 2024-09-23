package 고득점kit.스택큐;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발스택 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> workDate = new LinkedList<>();
        ArrayList<Integer> release = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            //  반올림 하는 ceil
            workDate.add((int) Math.ceil((double) (100 - progresses[i]) / speeds[i]));
        }
        //남은기간 설정완료
        int front = workDate.poll();
        int count = 1;
        while (!workDate.isEmpty()) {
            if (front < workDate.peek()) {
                release.add(count);
                count = 1;
                front = workDate.poll();
            } else {
                count++;
                workDate.poll();
            }
        }
        release.add(count);

        return release.stream().mapToInt(Integer::intValue).toArray();
    }
}
//[93, 30, 55]	[1, 30, 5]	[2, 1]
