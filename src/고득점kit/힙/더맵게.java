package 고득점kit.힙;

import java.util.PriorityQueue;
import java.util.Queue;

public class 더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            heap.add(scoville[i]);
        }

        while (heap.size() > 1 && heap.peek() < K) {
            int firstNumber = heap.poll();
            int secondNumber = heap.poll();
            int newScoville = firstNumber + (secondNumber * 2);
            heap.add(newScoville);
            answer++;
        }

        if (heap.peek() < K) {
            return -1;
        }

        return answer;
    }
}
