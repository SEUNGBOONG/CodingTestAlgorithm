package LV2.잡동ㄷ사니;

import java.util.LinkedList;
import java.util.Queue;

public class 타겟넘버BFS {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        //[4,1,2,1] 4 2
        for(int i = 0; i<numbers.length;i++){
            int size = queue.size();
            for(int j =0; j<size;j++){
                int sum= queue.poll();
                queue.add(sum+numbers[i]);
                queue.add(sum-numbers[i]);
            }
        }
        while (!queue.isEmpty()){
            if(queue.poll()==target){
                answer++;
            }
        }

        return answer;
    }
}
