package 기능별.스택큐;

import java.util.LinkedList;
import java.util.Queue;

public class 주식가격 {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> q = new LinkedList<>();

        for (int i : prices) {
            q.add(i);
        }

        int index = 0;
        while (!q.isEmpty()) {
            int currentPrice = q.poll();
            // currentPrice의 다음 가격부터 반복문을 진행 = i = (prices.length - q.size()
            for (int i = (prices.length - q.size()); i < prices.length; i++) {
                // 가격이 떨어 졌을 경우
                if (currentPrice > prices[i]) {
                    answer[index]++;
                    break;
                }
                // 가격이 떨어지지 않았을 경우
                if (currentPrice <= prices[i]) {
                    answer[index]++;
                }
            }
            index++;
        }
        return answer;
    }
}


//[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]
// 1  2 3  4 5 인데  뽑은거에서 다음 거 보다 낮아지는 순간 까지 count ++ 을 하고